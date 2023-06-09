package Stack.nextGreater;
import java.util.*;
public class leftNextSmallestElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextSmaller[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]<arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
                nextSmaller[i]=-1;
            else
                nextSmaller[i]=arr[s.peek()];
            s.push(i);
        }
        for(int i:nextSmaller)
            System.out.print(i+" ");
    }
}
