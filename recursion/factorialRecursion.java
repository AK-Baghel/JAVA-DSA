package recursion;
// import java.util.*;
public class factorialRecursion {
    public static int fact(int n){
        if(n==1)
            return n;
        return n*fact(n-1);
    }
 public static void main(String[] args) {
    int a=5;
    System.out.println(fact(a)); 
 }   
}
