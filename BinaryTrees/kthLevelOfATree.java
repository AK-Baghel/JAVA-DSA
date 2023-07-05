package BinaryTrees;
import java.util.*;
public class kthLevelOfATree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        static int idx=-1;

        public static Node build(int nodes[]){
            idx++;
            if(nodes[idx]==-1)
                return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=build(nodes);
            newNode.right=build(nodes);
            return newNode;
        }

        //Kth LEVEL OF A TREE
        public static void kthLevelOfATree(Node root,int k){
            if(root==null)
                return;

            int i=1;
                
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    i++;
                    if(i>k)
                        break;
                    if(q.isEmpty())
                        break;
                    else    
                        q.add(null);
                }
                else{
                    if(k==i)
                        System.out.print(currNode.data+", ");
                    if(currNode.left!=null)
                        q.add(currNode.left);
                    if(currNode.right!=null)
                        q.add(currNode.right);
                }


            }
        }

    }
    public static void main(String[] args) {
        int nodes[]={ 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1,7,-1,-1 };

        //Build Tree
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(nodes);

        //Kth Level of a Tree
        int k=3;
        System.out.print("Kth level of tree = ");
        tree.kthLevelOfATree(root, k);
    }
}
