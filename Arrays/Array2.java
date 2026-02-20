import java.util.*;

public class Array2 {
    // print pairs of arrays
    public static void printPairsOfArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = i;
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[curr]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void printSubArraysOfArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            int start = i;
            // System.out.print("["+arr[curr]+"]" + ",");
            for (int j = i ;j<arr.length; j++) {
               int end = j;
               int sum = 0;
               for (int k = start; k <= end ; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k]+" ");
               }
               System.out.print("sum:"+  sum );
               if(maxSum<sum){
                maxSum = sum;
               }
               if(sum < minSum){
                minSum = sum;
               }
               System.out.println();
            }
            System.out.println();
        }
        System.out.println("MaxSum:"+maxSum);
        System.out.println("MinSum:"+ minSum);
    }
    public static int printMaxSumofArray(int num[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int i =0 ; i< num.length; i++){
            cs = cs+ num[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
            maxElement = Math.max(maxElement, num[i]);
        }
        return (ms == 0) ? maxElement : ms;

    }

    public static int trappedRainwater(int height []){
        int leftMax[] = new int [height.length];
        leftMax[0]=height[0];
        for(int i= 1; i< height.length; i++){
            leftMax[i]= Math.max(leftMax[i-1], height[i]);

        }
        int rightMax [] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trappedRainwater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedRainwater += waterLevel-height[i];

        }
        return trappedRainwater;

    }
    public static int maxProfit(int prices []){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit= Math.max(profit, maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }



    public static void main(index[] args) {
        // int arr []={2,4,6,8,10};
        // printPairsOfArray(arr);
        // printSubArraysOfArray(arr);
        // int num [] = {-2,-3,-4,-1,-2,-1,-5,-3};
        // System.out.println(printMaxSumofArray(num));
        // int height [] ={4,2,0,6,3,2,5};
        // System.out.println(trappedRainwater(height));
        int prices [] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    
}
