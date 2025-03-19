package Recursion;

public class Recursion {
    public static void printDec(int n){
        if(n==1 || n==0){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1 || n==0){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
       
    }

    public static int sumOfNaturalNum(int n ){
        
        if(n==1){
            
            return 1;
        }
        // int Snm1 = sumOfNaturalNum(n-1);
        int Sn = n + sumOfNaturalNum(n-1);;
        return Sn;
        

    }
    public static int firstOccurence(int arr[], int key , int i){
        if(i  == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[], int key , int i){
        if(i  == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
       
        return isFound;
    }
    public static int power(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq = power(a, n/2) * power(a, n/2);
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n){
        if(n == 0 || n==1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static int frindsPairingWays(int n){
        if(n == 1 || n==2){
            return n;
        }
        int fnm1 = frindsPairingWays(n-1);
        int fnm2 = frindsPairingWays(n-2);
        int pairsWays = (n-1) * fnm2;
        int totalWays = pairsWays + fnm1;
        return totalWays;

        
    }
    public static void printBinary(int n, int lastSpace , String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinary(n-1, 0, str + "0");
        if(lastSpace == 0){
            printBinary(n-1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        // // int n =10;
        // // System.out.println(sumOfNaturalNum(n));
        // int arr [] = {8,3,6,9,5,10,2,5,3};
        // // System.out.println(lastOccurence(arr, 5, 0));
        // int a =2 ;
        // int n = 10;
        // System.out.println(power(a,n));
        // System.out.println(tilingProblem(4));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean [26]);
        // System.out.println(frindsPairingWays(2));
        printBinary(3, 0, "");
    }
}
