import java.util.*;

public class MagicNumber {

    public static int nthMagicalNumber(int n, int base) {
        int ans = 0;
       
        while(n > 0){
            int lastDigit = n & 1;
            n = n >> 1; 
            ans += lastDigit * base;
            base = base * 5;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(nthMagicalNumber(6, 5));
    }
}