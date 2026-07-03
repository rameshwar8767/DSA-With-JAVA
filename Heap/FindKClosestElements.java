import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet> {
    int num;
    int diff;

    Triplet(int num, int diff) {
        this.num = num;
        this.diff = diff;
    }

    @Override
    public int compareTo(Triplet t) {

        // Compare by difference
        if (this.diff != t.diff) {
            return Integer.compare(this.diff, t.diff);
        }

        // If differences are equal, compare by number
        return Integer.compare(this.num, t.num);
    }
}

public class FindKClosestElements {

    // LeetCode 658
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Max Heap
        PriorityQueue<Triplet> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : arr) {
            int diff = Math.abs(x - ele);

            pq.add(new Triplet(ele, diff));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll().num);
        }

        // Required by the problem
        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

        FindKClosestElements obj = new FindKClosestElements();

        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        List<Integer> ans = obj.findClosestElements(arr, k, x);

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("k = " + k);
        System.out.println("x = " + x);
        System.out.println("Closest Elements : " + ans);
    }
}