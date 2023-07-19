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


    //Delting Node in B.S.T.
    public static Node inorderSuccessor(Node root){
        while(root.left!=null)
            root=root.left;
        return root;
    }

    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }
        else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{

            //case-1 Leaf Node
            if(root.left==null && root.right==null)
                return null;
            
            //case-2 have 1 Child Node
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            
            //case-3 have 2 Child Nodes
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }

        return root;
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

        //Delete the Node form B.S.T.
        root=delete(root,5);
        inorder(root);
    }
}
