import java.util.*;

public class SetMismatch {

    // Leetcode 645
    public static int[] findErrorNums(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Store frequency of each number
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int[] ans = new int[2];

        // Find duplicate and missing numbers
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i) && map.get(i) == 2) {
                ans[0] = i;
            }

            if (!map.containsKey(i)) {
                ans[1] = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = findErrorNums(nums);

        System.out.println("Duplicate Number: " + result[0]);
        System.out.println("Missing Number : " + result[1]);

        sc.close();
    }
}