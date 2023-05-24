public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 6, 3 };
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
