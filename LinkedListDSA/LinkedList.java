package LinkedListDSA;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void print(){
        if(head==null){
            System.out.println("Empty LinkedList");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.print();
    }
}
