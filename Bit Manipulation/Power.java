import java.util.*;
public class Power {
        public static double myPow(double x, int n) {
        long N = n; // handle overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {
            if ((N & 1) == 1) { // check odd
                ans *= x;
            }
            x *= x;
            N >>= 1;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(4,10));
    }
}
