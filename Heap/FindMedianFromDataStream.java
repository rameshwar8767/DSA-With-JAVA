import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (maxHeap.isEmpty())
            maxHeap.add(num);
        else {
            if (num < maxHeap.peek())
                maxHeap.add(num);
            else
                minHeap.add(num);
        }

        if (maxHeap.size() == minHeap.size() + 2) {
            minHeap.add(maxHeap.remove());
        }

        if (minHeap.size() == maxHeap.size() + 2) {
            maxHeap.add(minHeap.remove());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size() + 1) {
            return maxHeap.peek();
        } else if (minHeap.size() == maxHeap.size() + 1) {
            return minHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}

public class FindMedianFromDataStream {

    // Leetcode 295

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        int[] nums = {1, 2, 3, 4, 5};

        for (int num : nums) {
            mf.addNum(num);
            System.out.println("Added: " + num);
            System.out.println("Median: " + mf.findMedian());
            System.out.println("----------------");
        }
    }
}