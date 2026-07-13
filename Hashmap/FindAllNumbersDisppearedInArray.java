import java.util.*;

public class FindAllNumbersDisppearedInArray {

    // Leetcode 448

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        ArrayList<Integer> ans = new ArrayList<>();

        // Store frequency of elements
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Find missing numbers
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                ans.add(i);
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

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Missing Numbers: " + result);

        sc.close();
    }
}