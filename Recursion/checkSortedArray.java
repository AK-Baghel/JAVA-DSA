public class checkSortedArray {
    public static boolean sort(int arr[],int i){
        if(i>arr.length-2){
            return true;
        }
        if(arr[i]<arr[i+1]){
            i++;
            return sort(arr,i);
        }
        else
            return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int i=0;
        System.out.print(sort(arr,i));
    }
}
