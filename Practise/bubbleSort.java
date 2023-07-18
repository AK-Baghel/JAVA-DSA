package Practise;
public class bubbleSort{
    public static void main(String[] args) {
        int arr[]={56,18,2,4,1,6,3,88,0};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag =false;
                }
            }
            if(flag)
                break;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}