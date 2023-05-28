import java.util.*;
public class searchInRotatedSortedArray{
    public static int searc(int arr[],int key,int s,int e){
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==key)
            return mid;
        
        if(arr[s]<=arr[mid]){
            if(arr[s]<=key && key<=arr[mid])
                searc(arr,key,s,mid-1);
            else
                searc(arr,key,mid+1,e);
        }
        else{
            if(arr[mid+1]<=key && key<=arr[e])
                searc(arr, key, mid+1, e);
            else
                searc(arr, key, s, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,1,2,3,4};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        System.out.println(searc(arr,key,0,arr.length-1));
    }
}