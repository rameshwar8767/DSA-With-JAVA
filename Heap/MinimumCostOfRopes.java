import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumCostOfRopes {

    // GFG

    public static int minCost(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;

        // Insert all rope lengths into Min Heap
        for (int ele : arr) {
            pq.add(ele);
        }

        // Connect two smallest ropes until one rope remains
        while (pq.size() > 1) {

            int x = pq.remove();
            int y = pq.remove();

            int cost = x + y;
            sum += cost;

            pq.add(cost);
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 6};

        System.out.println("Ropes : " + Arrays.toString(arr));

        int ans = minCost(arr);

        System.out.println("Minimum Cost = " + ans);
    }
}