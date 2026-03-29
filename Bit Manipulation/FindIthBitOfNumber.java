import java.util.*;

public class FindIthBitOfNumber {

    public static int findIthBit(int n, int k){
        int mask = 1 << (k - 1);
        return (n & mask) != 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(findIthBit(13,2));
    }
}
