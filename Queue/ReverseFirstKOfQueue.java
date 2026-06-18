import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class ReverseFirstKOfQueue {

    // GFG
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

        int n = q.size();

        if (k > n || k <= 0) {
            return q;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        int rem = n - k;

        for (int i = 0; i < rem; i++) {
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        ReverseFirstKOfQueue obj = new ReverseFirstKOfQueue();

        System.out.println("Original Queue: " + q);

        obj.reverseFirstK(q, 3);

        System.out.println("After Reversing First 3 Elements: " + q);
    }
}