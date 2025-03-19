import java.util.*;


public class Array{

    

    // public static int maxSumSubArray(int arr[]){

    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for(int i = 0; i<arr.length; i++){
    //         int start = i;
           
    //         for(int j = i; j< arr.length; j++){
    //             currSum =0;
    //             int end = j;
    //             for(int k = start; k<=end ; k++){
    //                 currSum = currSum + arr[k];
    //                 System.out.println(currSum);
    //                 if(maxSum<currSum){
    //                     maxSum = currSum;
    //                 }
    //             }
                
    //         }
            
    //     }
    //     System.out.println();
    //     return maxSum;


       
    // }

    public static void kadanes(int arr[]){
    //     int cs = 0;
    //     int ms = Integer.MIN_VALUE;
    //     for(int i =0; i<arr.length; i++){
        
    //         cs = cs + arr[i];
    //         if(cs<0){
    //             cs =0;
    //         }
    //         ms = Math.max(ms, cs);

            
    //     }
    //     System.out.println("Max sum:" + ms);
    // }

    // public static void main(String args []){
    //     int arr[] = {2,4,6,8,10};

    //     kadanes(arr);
    }
}