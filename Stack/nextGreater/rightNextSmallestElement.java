package Stack.nextGreater;

import java.util.*;

public class rightNextSmallestElement {
    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextSmallest[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[i] < arr[s.peek()])
                s.pop();

            if (s.isEmpty())
                nextSmallest[i] = -1;
            else
                nextSmallest[i] = arr[s.peek()];

            s.push(i);
        }

        for (int i : nextSmallest)
            System.out.print(i + " ");
    }
}
