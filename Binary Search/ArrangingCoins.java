public class ArrangingCoins {
    public static int arrangeCoins(long n) {
        long start = 0;
        long end = n;
        long ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long k = mid * (mid + 1) / 2;

            if (k == n) return (int) mid;
            else if (k < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5)); // Output: 2
    }
}