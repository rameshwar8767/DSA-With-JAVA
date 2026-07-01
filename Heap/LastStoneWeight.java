import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    // Leetcode 1046

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones into Max Heap
        for (int stone : stones) {
            pq.add(stone);
        }

        // Smash the two heaviest stones
        while (pq.size() > 1) {
            int x = pq.remove(); // Largest stone
            int y = pq.remove(); // Second largest stone

            // If they are not equal, push the remaining weight
            if (x != y) {
                pq.add(x - y);
            }
        }

        // If heap is empty, return 0
        if (pq.isEmpty()) {
            return 0;
        }

        // Otherwise, return the last remaining stone
        return pq.peek();
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        int ans = lastStoneWeight(stones);

        System.out.println("Last Stone Weight: " + ans);
    }
}