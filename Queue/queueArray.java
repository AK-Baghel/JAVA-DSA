package Queue;

public class queueArray {

    public static class Queue {

        static int arr[];
        static int rear;
        static int size;

        public Queue(int n) {
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear=rear+1;
            arr[rear] = data;
        }

        public static void peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println(arr[0]);
        }

        public static void remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
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
