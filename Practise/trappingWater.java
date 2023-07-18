package Practise;
public class trappingWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};

        int leftArr[]=new int[arr.length];
        leftArr[0]=arr[0];
        int leftMax=leftArr[0];

        for(int i=1;i<leftArr.length;i++){
            leftMax=Math.max(leftMax,arr[i]);
            leftArr[i]=leftMax;
        }

        int rightArr[]=new int[arr.length];
        rightArr[arr.length-1]=arr[arr.length-1];
        int rightMax=rightArr[arr.length-1];
        
        for(int i=arr.length-2;i>=0;i--){
            rightMax=Math.max(rightMax,arr[i]);
            rightArr[i]=rightMax;
        }
        
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Math.min(leftArr[i],rightArr[i])-arr[i];
        }

        System.out.println(total);
    }
}
