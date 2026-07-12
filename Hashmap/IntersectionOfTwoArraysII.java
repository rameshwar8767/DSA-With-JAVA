import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOfTwoArraysII {

    // Leetcode 350
    public static int[] intersect(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of the larger array
        if (m < n) {

            for (int num : nums2) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int num : nums1) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    ans.add(num);

                    if (map.get(num) == 1) {
                        map.remove(num);
                    } else {
                        map.put(num, map.get(num) - 1);
                    }
                }
            }

        } else {

            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int num : nums2) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    ans.add(num);

                    if (map.get(num) == 1) {
                        map.remove(num);
                    } else {
                        map.put(num, map.get(num) - 1);
                    }
                }
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();

        int[] nums1 = new int[m];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = intersect(nums1, nums2);

        System.out.println("Intersection of the two arrays:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}