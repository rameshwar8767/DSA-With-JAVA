import java.util.*;

public class GetRightMostSetBit {

    public static int getRightMostSetBit(int n){
        if(n == 0) return 0;
        int res = n & (~n + 1);
        return (int)(Math.log(res)/Math.log(2)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(getRightMostSetBit(18));
    }
}
