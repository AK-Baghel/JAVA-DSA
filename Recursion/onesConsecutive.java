public class onesConsecutive {
    public static void stringBinary(int n,int lastSpace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        stringBinary(n-1, 0, str+"0");
        if(lastSpace==0)
            stringBinary(n-1, 1, str+"1");
    }
    public static void main(String[] args) {
        int n=3;
        stringBinary(n,0,"");
    }
}
