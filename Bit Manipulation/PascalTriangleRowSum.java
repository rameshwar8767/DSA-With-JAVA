import java.util.*;

public class PascalTriangleRowSum {
    public static int rowSum(int n) {
        return 1 << n;   // 2^n
    }
    public static void main(String[] args) {
        System.out.println(rowSum(10));
    }
}


