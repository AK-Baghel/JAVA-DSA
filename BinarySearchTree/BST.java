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


    //Searching of B.S.T.
    public static boolean search(Node root,int key){
        if(root==null)
            return false;

        if(root.data==key)
            return true;

        if(root.data>key)
            return search(root.left, key);
        else
            return search(root.right, key);
    } 
    
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int val:values){
            root=insert(root,val);
        }

        // Printing the B.S.T.
        System.out.print("Binary Search Tree Print = ");
        inorder(root);       
        System.out.println();

        //Search in B.S.T.
        int key=4;
        System.out.print("Searching of a key : " + search(root,key));
        System.out.println();
    }
}
