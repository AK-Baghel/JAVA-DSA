package Stack;

import java.util.*;

public class ALByStack {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void push(int data) {
        list.add(data);
    }

    public static int pop() {
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }
    public static int peek() {
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        ALByStack s = new ALByStack();
        s.push(5);
        s.push(3);
        s.push(1);
        System.out.println("Push in Stack " + list);
        System.out.println("Pop in stack " + s.pop());
        System.out.println("After Pop " + list);
        System.out.println("Peek " + peek());
    }
}
