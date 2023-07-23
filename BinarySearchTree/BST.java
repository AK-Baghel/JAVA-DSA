package BinarySearchTree;
import java.util.*;
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

    //Print Nodes In Range
    public static void printInRange(Node root,int k1,int k2){
        if(root==null)
            return;
        // if(root.data>=k1 && root.data<=k2){
        //     printInRange(root.left, k1, k2);
        //     System.out.print(root.data+" ");
        //     printInRange(root.right, k1, k2);
        // }
        // else if(root.data<k1){
        //     printInRange(root.left, k1, k2);
        // }
        // else{
        //     printInRange(root.right, k1, k2);
        // }
        if(root.data>k1 && root.data>k2){
            printInRange(root.left, k1, k2);
        }
        else if(root.data<k1 && root.data<k2){
            printInRange(root.right, k1, k2);
        }
        else{
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
    }

    //Print Root To Leaf Path
    public static boolean printRootToLeaf(Node root,ArrayList<Integer> path){
        if(root==null)
            return true;

        path.add(root.data);
        
        boolean left=printRootToLeaf(root.left, path);
        boolean right=printRootToLeaf(root.right, path);

        if(left && right){
            System.out.println(path);
        }
        path.remove(path.size()-1);
        return false;

    }

    //Checking Validate B.S.T
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null)
            return true;
            
        if(min !=null && root.data<=min.data)
            return false;
        else if(max !=null && root.data>=max.data)
            return false;
            
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }
    
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
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
        // root=delete(root,5);
        // inorder(root);

        //   Run Delete or printInRange at once

        //Print B.S.T nodes in range
        System.out.print("Nodes in Range of 5 to 20 = ");
        printInRange(root,5,20);
        System.out.println();

        //Print Root to Leaf
        System.out.println("Printing Root to Leaf Path -");
        printRootToLeaf(root,new ArrayList<>());

        //Checking Validate B.S.T.
        System.out.print("Validate Binary Search Tree = ");
        System.out.println(isValidBST(root,null,null));
        System.out.println();

    }
}
