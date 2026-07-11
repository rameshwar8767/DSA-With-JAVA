import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMissingElements {

    // Leetcode 3731

    public static List<Integer> findMissingElements(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for (int num : nums) {
            start = Math.min(start, num);
            end = Math.max(end, num);
        }

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        while (start <= end) {
            if (set.contains(start)) {
                start++;
            } else {
                ans.add(start);
                start++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {3, 7, 1, 2, 8, 4, 5};

        List<Integer> result = findMissingElements(nums);

        System.out.println("Missing Elements: " + result);
    }
}