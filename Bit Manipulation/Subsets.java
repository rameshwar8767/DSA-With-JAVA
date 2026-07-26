import java.util.ArrayList;
import java.util.List;

public class Subsets {
    // LeetCode 78

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int m = (1 << n);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> a = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    a.add(nums[j]);
                }
            }

            ans.add(a);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = subsets(nums);

        System.out.println("Subsets are:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}