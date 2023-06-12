package Queue;

public class circularArrayQueue {
    public static class Queue {
        static int arr[];
        static int rear;
        static int front;
        static int size;

        public Queue(int n) {
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            arr[rear] = data;
            System.out.println(data);
        }

        public static void peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.print(arr[front] + "->");
        }

        public static void remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            if(front==rear)
                front=rear=-1;
            else
                front = (front + 1) % size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            q.peek();
            q.remove();
        }
    }
}
