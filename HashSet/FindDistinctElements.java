import java.util.HashSet;

public class FindDistinctElements {

    // GFG
    public static int distinct(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 10, 40};

        System.out.println(distinct(arr, arr.length)); // Output: 4
    }
}