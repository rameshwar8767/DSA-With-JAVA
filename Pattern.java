import java.util.*;

public class Pattern{


    public static void main(index[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n= sc.nextInt();

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<=i; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n-i; j++){
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        char ch = 'A';
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
    }
}