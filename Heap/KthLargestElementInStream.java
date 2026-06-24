import java.util.PriorityQueue;

public class KthLargestElementInStream {
    // Leetcode 703

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.add(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 8, 2};

        KthLargestElementInStream kth =
                new KthLargestElementInStream(3, nums);

        System.out.println(kth.add(3));   // 4
        System.out.println(kth.add(5));   // 5
        System.out.println(kth.add(10));  // 5
        System.out.println(kth.add(9));   // 8
        System.out.println(kth.add(4));   // 8
    }
}