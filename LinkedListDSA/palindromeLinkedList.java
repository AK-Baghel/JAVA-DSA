package LinkedListDSA;

public class palindromeLinkedList {
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
            System.out.println("linked List is empty");
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
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void palindrome(){
        Node temp=head;
        Node mid=mid(temp);

        Node curr=mid;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=temp;
        Node right=prev;

        while(right!=null){
            if(left.data!=right.data){
                System.out.println("Not Palindrome");
                return;
            }
            left=left.next;
            right=right.next;
        }
        System.out.println("It's Palindrome");
    }
    public static void main(String[] args) {
        palindromeLinkedList ll=new palindromeLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(2);
        ll.add(1);

        ll.print();
        System.out.println();
        ll.palindrome();
    }
}
