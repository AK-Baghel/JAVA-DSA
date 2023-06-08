package Stack;

import java.util.Stack;

public class reverseStringStack {
    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder newStr=new StringBuilder("");
        while(!s.isEmpty()){
            newStr.append(s.pop());
        }
        return newStr.toString()
;
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.print(reverse(str));
    }
}
