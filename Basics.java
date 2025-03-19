import java.util.*; 
 
 public class Basics{
    public static void main(index args []){
        Scanner sc = new Scanner(System.in);

        // System.out.println("enter the length:");
        // int a =  sc.nextInt();
        // System.out.println("enter the breadth:");
        // int b =  sc.nextInt();
        // int area = a * b;
        // System.out.println("area:" + area);

        // System.out.println("enter size of sqaure");
        // int n = sc.nextInt();
        // for(int i =0; i<n; i++){
        //     for(int j =0; j<n; j++){
            
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        //print reverse of number
        // System.out.println("enter number");
        // int n = sc.nextInt();
        // int lastDigit;
        // while(n>0){
        //     lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n=n/10;
        // }

        //reverse the given number

        // System.out.println("enter number");
        // int n = sc.nextInt();
        
        // int rev = 0;
        // while(n > 0){
        //     int lastDigit = n % 10;
        //     rev = (rev*10) + lastDigit;
            
        //     n = n/10;
        // }
        // System.out.print(rev);
        // System.out.println("enter number");
        // int n = sc.nextInt();
        // while(true){
        //     if(n%10 != 0){
        //         System.out.println("enter number");
        //         n = sc.nextInt();
        //     }else{
        //         break;
        //     }
        // }

        //check is prime 
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if(n==1){
            System.out.println(n +" "+ "is not prime");
            return;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(n +" "+ "is not prime");
                return;
            }
        }
        System.out.println(n + " "+"is prime");
    }
 }