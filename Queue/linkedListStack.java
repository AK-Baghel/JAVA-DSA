package Queue;

public class linkedListStack {
    public static int size = 0;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head=tail=newNode;
                size++;
                return;
            }
            tail.next=newNode;
            tail=newNode;
            size++;
        }

        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            if(tail==head)
                tail=head=null;
            else
                head=head.next;

            size--;
        }

        public static void peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.print(head.data);
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Size = " + size);
        while(!q.isEmpty()){
            q.peek();
            q.remove();
        }
        System.out.println();
        System.out.println("Size = " + size);
    }
}
