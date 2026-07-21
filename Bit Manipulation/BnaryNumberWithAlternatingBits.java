public class BnaryNumberWithAlternatingBits {

    // Leetcode 693
    public static boolean hasAlternatingBits(int n) {
        int ans = n ^ (n >> 1);
        return (ans & (ans + 1)) == 0;
    }    
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(4));
    }
}