import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //(n & 1) checks the last bit of the number.
        // If last bit is 0 → number is even
        // If last bit is 1 → number is odd
        int n = sc.nextInt();
        if((n & 1) == 0) {
            System.out.println("Even");
            return;
        }else{
            System.out.println("Odd");
        }
    }
}
