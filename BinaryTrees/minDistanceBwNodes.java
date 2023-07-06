package BinaryTrees;
import java.util.*;
public class minDistanceBwNodes {
    
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

        // Lowest Common Ancestor
        public static boolean getPath(Node root,int n,ArrayList<Node> path){
            if(root==null)
                return false;
            
            path.add(root);
            
            if(root.data==n)
                return true;
            
            boolean foundLeft=getPath(root.left, n, path);
            boolean foundRight=getPath(root.right, n, path);

            if(foundLeft||foundRight)
                return true;

            path.remove(path.size()-1);
            return false;

        }

        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);

            int i=0;
            while(i<path1.size() && i<path2.size()){
                if(path1.get(i)!=path2.get(i))
                    break;
                i++;
            }

            //MIN DISTANCE B/W NODES (Line - 64 & 65)
            int a=path1.size()-i+path2.size()-i;
            System.out.println("Min Distance b/w nodes = "+a);

            Node lca=path1.get(i-1);
            return lca;
        }

    }
    public static void main(String[] args) {
        int nodes[]={ 1, 2, 4,-1,-1, 5, -1, -1, 3, 6, -1, -1,7,8,-1,-1,9,10,-1,-1,-1,-1 };

//                                             1  
//                                           /   \
//                                          2     3
//                                        /  \   / \
//                                       4    5 6   7
//                                                 / \           
//                                                8   9
//                                                   /
//                                                  10 

        //Build Tree
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(nodes);

        //Lowest Common Ancestor
        int n1=4,n2=10;
        System.out.print("The Lowest Common Ancestor for n1 & n2 = "+tree.lca(root,n1,n2).data);
    }
}
