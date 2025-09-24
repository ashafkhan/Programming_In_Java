package L03Array;
import java.util.*;
public class J14Array_adv {
    
    public static void maxSubarraySum_brutForce(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                int curr_sum=0;
                for(int k=start; k<=end; k++){
                    curr_sum += arr[k];
                }
                System.out.println("Curr_sum: "+curr_sum);
                if(maxSum<curr_sum){
                    maxSum=curr_sum;
                }
            }
            System.out.println();
        }
        System.out.println("maxSum: "+maxSum);
    }

    public static void maxSubarraySum_prefixSum(int arr[]){
        int curr_sum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;

                curr_sum=(start==0)?prefix[end]:prefix[end]-prefix[start-1];
                System.out.println("Curr_sum: "+curr_sum);
                if(maxSum<curr_sum){
                    maxSum=curr_sum;
                }
            }
        }
        System.out.println("maxSum: "+maxSum);
    }

    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<arr.length; i++){
            cs+=arr[i];
            if(ms<cs){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        System.out.println("maxSum: "+ms);
    }

    public static int trappedRain(int height[]){
        int n=height.length;
        //calc leftmax boundary-array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1; i<n; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //calc rightmax boundary-array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater=0;
        //loop
        for(int i=0; i<n; i++){
            //waterlevel=min(leftmax bound, rightmax bound)
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            //trappedwater=waterlevel-height[i]
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;
    }

    public static int buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int arr[]={-9,-2,-3,-4};
        // maxSubarraySum_bruteForce(arr);
        // maxSubarraySum_prefixSum(arr);
        // kadanes(arr);

        int height[]={4, 2, 0, 3, 2, 5};
        int result=trappedRain(height);
        System.out.println(result);

        // int prices[]={7,1,5,3,6,4};
        // System.out.println(buyAndSellStocks(prices));
    }
}
