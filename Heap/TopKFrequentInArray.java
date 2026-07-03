import java.util.*;

public class TopKFrequentInArray {

    // Pair class
    static class Pair implements Comparable<Pair> {
        int num;
        int freq;

        Pair(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair p) {

            // Min Heap based on frequency
            if (this.freq != p.freq)
                return Integer.compare(this.freq, p.freq);

            // If frequency is same, smaller number has lower priority
            return Integer.compare(this.num, p.num);
        }
    }

    // GFG
    public static ArrayList<Integer> topKFreq(int[] arr, int k) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Maintain only k most frequent elements
        for (int num : map.keySet()) {

            pq.add(new Pair(num, map.get(num)));

            if (pq.size() > k)
                pq.poll();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll().num);
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 3, 2, 2, 4};
        int k = 2;

        ArrayList<Integer> ans = topKFreq(arr, k);

        System.out.println(ans);
    }
}