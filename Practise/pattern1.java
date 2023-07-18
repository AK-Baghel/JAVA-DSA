package Practise;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value = ");
        int n=sc.nextInt();
        int p=2*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                if(j<=i || ((p-1-i)<=j && (j<p))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                if(j<=(n-1-i) || (j>(n-1+i) && (j<p))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
