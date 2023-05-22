public class fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fibo(n));
        // int a=0,b=1,i=0;
        // if(n==1 || i==0){
        //     System.out.print(a+" ");
        //     if(n>=2)
        //         System.out.print(b+" ");
        // }
        // while(i<n-2){
        //     int c=a+b;
        //     System.out.print(c+" ");
        //     a=b;
        //     b=c;
        //     i++;
        // }
    }
}
