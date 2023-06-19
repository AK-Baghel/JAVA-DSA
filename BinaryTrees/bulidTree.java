package BinaryTrees;
import java.util.*;
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

        // LEVELORDER TRAVERSAL
        public static void levelOrder(Node root){
            if(root==null)
                return;

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty())
                        break;
                    else    
                        q.add(null);
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null)
                        q.add(currNode.left);
                    if(currNode.right!=null)
                        q.add(currNode.right);
                }
            }
        }

        //HEIGHT OF A TREE
        public static int height(Node root){
            if(root==null)
                return 0;
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
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

        System.out.println();
        System.out.println("LevelOrder Traversal");
        tree.levelOrder(root);

        System.out.println();
        System.out.print("Height of TREE = ");
        System.out.println(tree.height(root));

        System.out.println();
    }
}
