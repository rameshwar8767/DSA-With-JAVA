import java.util.LinkedList;
import java.util.Queue;

public class RearrangeQueue {
    // GFG
    public static void rearrangeQueue(Queue<Integer> q) {

        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();

        for (int i = 0; i < n / 2; i++) {
            q2.add(q.remove());
        }

        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Example queue: 1 2 3 4
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Original Queue: " + q);

        rearrangeQueue(q);

        System.out.println("Rearranged Queue: " + q);
    }
}