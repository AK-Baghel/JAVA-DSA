package Stack;

public class LLByStack {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;

    public static boolean isEmpty(){
        return head==null;
    }

    public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }

    public static int peek(){
        return head.data;
    }
    public static void main(String[] args) {
        LLByStack ll=new LLByStack();
         ll.push(5);
         ll.push(3);
         ll.push(1);
         while(!isEmpty()){
            System.out.print(ll.peek() + "-> ");
            ll.pop();
         }
    }
}
