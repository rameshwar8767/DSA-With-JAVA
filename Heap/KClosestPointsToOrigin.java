import java.util.*;

class Triplet implements Comparable<Triplet> {
    int dist;
    int x;
    int y;

    Triplet(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Triplet t) {
        return Integer.compare(this.dist, t.dist);
    }
}

public class KClosestPointsToOrigin {
    // Leetcode 973

    public static int[][] kClosest(int[][] points, int k) {

        // Max Heap
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            int dist = x * x + y * y;

            pq.add(new Triplet(dist, x, y));

            if (pq.size() > k)
                pq.remove();
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            Triplet top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] points = {
                {1, 3},
                {-2, 2},
                {5, 8},
                {0, 1}
        };

        int k = 2;

        int[][] ans = kClosest(points, k);

        System.out.println("K Closest Points:");

        for (int[] p : ans) {
            System.out.println(Arrays.toString(p));
        }
    }
}