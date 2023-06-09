package Stack;

import java.util.*;

public class stockSpanProblem {

    public static void stockSpan(int arr[], int span[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;
        for (int i = 1; i < span.length; i++) {
            int currPrice = arr[i];
            while (!s.isEmpty() && currPrice > arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[arr.length];
        stockSpan(arr, span);

        for (int i = 0; i < span.length; i++)
            System.out.print(span[i] + "  ");

    }
}
