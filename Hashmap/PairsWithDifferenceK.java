import java.util.HashMap;

public class PairsWithDifferenceK {

    // GFG
    public static int countPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int pairs = 0;

        for (int num : map.keySet()) {
            if (map.containsKey(num + k)) {
                pairs += map.get(num) * map.get(num + k);
            }
        }

        return pairs;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        int result = countPairs(arr, k);

        System.out.println("Number of pairs: " + result);
    }
}