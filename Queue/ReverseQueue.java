import java.util.*;

public class ReverseQueue {

    // GFG
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original Queue: " + q);

        ReverseQueue obj = new ReverseQueue();
        obj.reverseQueue(q);

        System.out.println("Reversed Queue: " + q);
    }
}