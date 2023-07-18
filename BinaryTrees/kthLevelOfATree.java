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

        //Kth LEVEL OF A TREE BY LEVEL-ORDER Traversal
        public static void kthLevelOfATreeLO(Node root,int k){
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

        //Kth LEVEL OF A TREE BY PRE-ORDER Recursion
        public static void kthLevelOfATreePO(Node root,int k,int level){
            if(root==null){
                return;
            }
            
            if(level==k){
                System.out.print(root.data+", ");
                return;
            }
         
            kthLevelOfATreePO(root.left,k,level+1);
            kthLevelOfATreePO(root.right,k,level+1);
        }

    }
    public static void main(String[] args) {
        int nodes[]={ 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1,7,-1,-1 };

        //Build Tree
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(nodes);

        //Kth Level of a Tree --->Approach 1 by using LEVEL-ORDER traversal...
        int k=3;
        System.out.print("Kth level of tree by Level-Order = ");
        tree.kthLevelOfATreeLO(root, k);

        //Kth Level of a Tree --->Approach 2 by using PRE-ORDER recursion...
        System.out.println();
        System.out.print("Kth level of tree by Pre-Order = ");
        tree.kthLevelOfATreePO(root, k,1);

    }
}
