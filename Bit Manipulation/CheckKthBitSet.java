import java.util.*;
public class CheckKthBitSet {
    public static boolean checkKthBit(int n, int k){
        n = n >> k;
        if(n % 2 == 0)return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkKthBit(500, 3));
    }
}
