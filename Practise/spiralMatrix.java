package Practise;
public class spiralMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sc=0,sr=0,er=arr.length-1,ec=arr[0].length-1;
        while(sc<=ec && sr<=er){
            for(int i=sc;i<=ec;i++){
                System.out.print(arr[sr][i]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            for(int i=ec-1;i>=sc;i--){
                System.out.print(arr[er][i]+" ");
            }
            for(int i=er-1;i>=sr+1;i--){
                System.out.print(arr[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
}
