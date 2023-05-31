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
    public static int size=0;

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
        System.out.println();
    }

    public static void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public static void last(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }

    public static void mid(int position,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<position-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    public static void removeFirst(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        System.out.println("Remove Node = "+ head.data);
        head=head.next;
        size--;
    }

    public static void removeLast(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp=head;
        int i=0;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        System.out.println("Remove Node = "+ temp.next.data);
        temp.next=null;
        tail=temp;
        size--;
    }

    public static void search(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Key is Found in LinkedList");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.add(3);
        ll.add(2);
        ll.add(1);

        ll.mid(3,0);

        ll.last(4);
        ll.last(5);
        ll.last(6);

        ll.removeFirst();

        ll.removeLast();

        ll.search(4);

        ll.print();

        System.out.println("Size of LinkedList = "+size);
    }
}
