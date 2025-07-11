import java.util.*;
public class index {

    public static void printNumbers(int lRange,int uRange){
        if(lRange > uRange){
            return;
        }
        printNumbers(lRange+1, uRange);
        System.out.println(lRange);
    }
    
    public static int sumOfArray(int[] num, int index) {
        if (index == num.length) {
            return 0; // Base case: no elements left to add
        }
        return num[index] + sumOfArray(num, index + 1); // Recursive case
    }

    // public static String revString(String str){
    //     String revString = "";
    //     for(int i =0; i< str.length(); i++){
    //         char ch = str.charAt(i);
    //         revString = ch + revString;
    //     }
    //     return revString;
    // }
    public static String revString(String str){
        
        if(str.length() <= 1){
            return str;
        }
        return revString(str.substring(1)) + str.charAt(0);
        
    }

    public static int nFact(int n){
        if(n == 0 || n==1){
            return 1;
        }
        return n * nFact(n-1);
    }
    public static void main(String[] args) {
        // printNumbers(1, 5);
        int[] num = {1,2,3,5};
        // System.out.println(sumOfArray(num,0));
        String str = "hello";
        System.out.println(revString(str));
        System.out.println(nFact(2));
    }
}
