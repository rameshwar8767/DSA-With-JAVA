import java.util.*;

public class Solution{

    // public static int calculateFactorial(int n){
    //     int factorial =1;
    //     if(n==1 || n==0){
    //         return 1;
    //     }
        
    //     for (int i = 2; i <= n; i++) {
    //         factorial = factorial *i; 
    //     }
    //     return factorial;
        
    // }
    // public static int binCoeff(int n, int r){
    //     int nFactorial = calculateFactorial(n);
    //     int rFactorial = calculateFactorial(r);
    //     int nrFactorial = calculateFactorial(n-r);

    //     int solution = (nFactorial)/rFactorial*(nrFactorial);
    //     return solution;
    // }

    public static int binaryToDecimal(int n){
        int decimal = 0;
        int power = 0;
        int ld =0;
        while(n>0){
            ld = n%10;
            decimal = decimal + (int)(ld*( Math.pow(2,power)));

            power++;
            n = n/10;
        }
        return decimal;
    }

    // public static boolean checkPalli(int n){
    //     int rev = 0;
    //     while(n > 0){
    //         int lastDigit = n % 10;
    //         rev = (rev*10) + lastDigit;
            
    //         n = n/10;
    //     }
    //    if(rev == n){
    //     return true;
    //    }
    //    return false;
    // }

    public static int trappedRainwater(int height[]){
        int leftMaxBoundary []= new int[height.length];
        leftMaxBoundary[0]= height[0];
        for (int i = 1; i < leftMaxBoundary.length; i++) {
            leftMaxBoundary[i]= Math.max(height[i], leftMaxBoundary[i-1]);
        }
        int rightMaxBoundary []= new int [height.length];
        rightMaxBoundary[height.length-1]= height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }
        int trappedRainwater = 0;
        for (int i = 0; i < rightMaxBoundary.length; i++) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedRainwater += waterLevel- height[i];
        }
        return trappedRainwater;
    }
   public static void main(index [] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your Number n");
    // int n = sc.nextInt();
    // // System.out.println("Enter your Number r");
    // // int r = sc.nextInt();
    // // int bCoeff=  binCoeff(n,r);
    // // System.out.println(bCoeff);

    // System.out.println(checkPalli(n));
    int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trappedRainwater(height));
   }
}