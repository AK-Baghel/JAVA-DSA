package BinarySearchTree;

public class BST {
   
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val)
            root.left=insert(root.left,val);
        else   
            root.right=insert(root.right,val);
        
        return root;
    }

    public static void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int val:values){
            root=insert(root,val);
        }

        inorder(root);       // Printing the B.S.T.
        System.out.println();
    }
}