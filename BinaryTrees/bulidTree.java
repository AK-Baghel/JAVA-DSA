package BinaryTrees;

public class bulidTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        // CREATING BINARY TREE
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // PREORDER TRAVEERSAL
        public static void preorder(Node root) {
            if (root == null) {
                // System.out.print(-1 + "->");
                return;
            }

            System.out.print(root.data + "->");
            preorder(root.left);
            preorder(root.right);
        }

        // INORDER TRAVERSAL
        public static void inorder(Node root) {
            if (root == null) {
                // System.out.print(-1 + "->");
                return;
            }
            inorder(root.left);
            System.out.print(root.data + "->");
            inorder(root.right);
        }

        // PREORDER TRAVERSAL
        public static void postorder(Node root) {
            if (root == null) {
                // System.out.print(-1 + "->");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "->");
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.print("Preorder traversal = ");
        tree.preorder(root);

        System.out.println();
        System.out.print("Inorder traversal = ");
        tree.inorder(root);

        System.out.println();
        System.out.print("Postorder traversal = ");
        tree.postorder(root);
    }
}
