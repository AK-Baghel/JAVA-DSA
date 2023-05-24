public class lastOccurence {
    public static int check(int arr[],int i,int key){
        if(i<=0)
            return -1;
        if(arr[i]==key)
            return i;
        i--;
        return check(arr,i,key);
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,3,2,5};
        System.out.println(check(arr,arr.length-1,3)); 
    }
}
