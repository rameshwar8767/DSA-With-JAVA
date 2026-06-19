import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInEveryWindowOfSizeK {
    // GFG
    public static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // Store indices of all negative numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        // Process each window
        for (int i = 0; i <= arr.length - k; i++) {

            // Remove indices that are out of the current window
            while (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }

            // Check if first negative lies inside current window
            if (!q.isEmpty() && q.peek() <= i + k - 1) {
                ans.add(arr[q.peek()]);
            } else {
                ans.add(0);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;

        System.out.println(firstNegInt(arr, k));
    }
}