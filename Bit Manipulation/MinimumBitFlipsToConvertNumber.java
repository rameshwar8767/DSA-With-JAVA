public class MinimumBitFlipsToConvertNumber {

    // LeetCode 2220
    public static int minBitFlips(int start, int goal) {
        int count = 0;
        int xor = start ^ goal;

        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int start = 10;
        int goal = 7;

        int result = minBitFlips(start, goal);

        System.out.println("Start: " + start);
        System.out.println("Goal: " + goal);
        System.out.println("Minimum Bit Flips: " + result);
    }
}