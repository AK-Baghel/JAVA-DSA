public class firstOccurence {
    public static int check(int arr[],int i,int key) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]!=key){
            i++;
            return check(arr,i,key);
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,3,2,5};
        System.out.println(check(arr,0,6));
    }
}
