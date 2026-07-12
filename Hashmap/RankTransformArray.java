import java.util.*;

public class RankTransformArray {
    // Leetcode 1331

    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = arrayRankTransform(arr);

        // Output
        System.out.println("Rank Transformed Array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}