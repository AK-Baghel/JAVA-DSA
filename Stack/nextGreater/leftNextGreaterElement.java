package Stack.nextGreater;

import java.util.Stack;

public class leftNextGreaterElement {
    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()])
                s.pop();
            if(s.isEmpty())
                nextGreater[i]=-1;
            else
                nextGreater[i]=arr[s.peek()];
            s.push(i);
        }
        for (int i : nextGreater)
            System.out.print(i + " ");
    }
}
