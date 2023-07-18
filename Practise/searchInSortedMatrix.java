public class searchInSortedMatrix {
    
    public static boolean searching(int arr[][],int key){
        int r=0,c=arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==key)
                return true;
            else if(arr[r][c]>key)
                c--;
            else
                r++;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=15;
        System.out.println(searching(arr,key));
    }
}
