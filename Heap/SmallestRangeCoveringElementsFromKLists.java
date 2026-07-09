import java.util.*;

public class SmallestRangeCoveringElementsFromKLists {

    // Leetcode 632

    class Triplet implements Comparable<Triplet> {
        int value;
        int row;
        int col;

        Triplet(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Triplet other) {
            return this.value - other.value;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        int max = Integer.MIN_VALUE;

        // Insert first element from every list
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            pq.offer(new Triplet(val, i, 0));
            max = Math.max(max, val);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        while (true) {

            Triplet curr = pq.poll();
            int min = curr.value;

            // Update answer
            if ((max - min < end - start) ||
                (max - min == end - start && min < start)) {
                start = min;
                end = max;
            }

            // If current list is exhausted, stop
            if (curr.col + 1 == nums.get(curr.row).size()) {
                break;
            }

            // Insert next element from the same list
            int next = nums.get(curr.row).get(curr.col + 1);

            pq.offer(new Triplet(next, curr.row, curr.col + 1));

            max = Math.max(max, next);
        }

        return new int[]{start, end};
    }

    public static void main(String[] args) {

        SmallestRangeCoveringElementsFromKLists obj =
                new SmallestRangeCoveringElementsFromKLists();

        List<List<Integer>> nums = new ArrayList<>();

        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));

        int[] ans = obj.smallestRange(nums);

        System.out.println("Smallest Range: [" + ans[0] + ", " + ans[1] + "]");
    }
}