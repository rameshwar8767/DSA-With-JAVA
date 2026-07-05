import java.util.*;

public class FindMedian {

    // GFG
    static class Solution {

        public double findMedian(int[] arr) {

            Arrays.sort(arr);

            int n = arr.length;

            if (n % 2 == 0) {
                int mid = n / 2;
                return (arr[mid - 1] + arr[mid]) / 2.0;
            }

            return arr[n / 2];
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] arr1 = {90, 100, 78, 89, 67};

        System.out.println(s.findMedian(arr1)); // 89.0

        int[] arr2 = {1, 2, 3, 4};

        System.out.println(s.findMedian(arr2)); // 2.5
    }
}