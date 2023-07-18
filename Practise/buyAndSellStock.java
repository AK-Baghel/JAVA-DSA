package Practise;
public class buyAndSellStock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int buyPrice=arr[0];
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            
            if(buyPrice>arr[i]){
                buyPrice=arr[i];
            }
            else{
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        System.out.println(maxProfit);
    }
}
