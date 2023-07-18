package Practise;
public class diagonalMatrixSum{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum=0;
        int i=0,n=arr.length,j=n-1;
        while(i<n){
            sum+=arr[i][i];
            if(i!=j)
                sum+=arr[j][i];
            j--;
            i++;
        }
        System.out.println(sum);
    }
}