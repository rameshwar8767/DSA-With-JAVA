import java.util.*;

public class TraversalInQueue {

    private static void display(Queue<Integer> q) {
        int n = q.size();

        for (int i = 0; i < n; i++) {
            int x = q.remove();
            System.out.print(x + " ");
            q.add(x);
        }
        System.out.println();
    }

    private static boolean addAtIndex(Queue<Integer> q, int val, int index) {
        int n = q.size();

        if (index < 0 || index > n) {
            return false;
        }

        Queue<Integer> temp = new LinkedList<>();

        for (int i = 0; i < index; i++) {
            temp.add(q.remove());
        }

        temp.add(val);

        while (!q.isEmpty()) {
            temp.add(q.remove());
        }

        while (!temp.isEmpty()) {
            q.add(temp.remove());
        }

        return true;
    }

    private static int removeAtIndex(Queue<Integer> q, int index) {
        int n = q.size();

        if (index < 0 || index >= n) {
            return -1;
        }

        Queue<Integer> temp = new LinkedList<>();
        int removed = -1;

        for (int i = 0; i < n; i++) {
            int curr = q.remove();

            if (i == index) {
                removed = curr;
            } else {
                temp.add(curr);
            }
        }

        while (!temp.isEmpty()) {
            q.add(temp.remove());
        }

        return removed;
    }

    private static int peekAtIndex(Queue<Integer> q, int index) {
        int n = q.size();

        if (index < 0 || index >= n) {
            return -1;
        }

        int peeked = -1;

        for (int i = 0; i < n; i++) {
            int curr = q.remove();

            if (i == index) {
                peeked = curr;
            }

            q.add(curr);
        }

        return peeked;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.print("Original Queue: ");
        display(q);

        boolean added = addAtIndex(q, 35, 4);
        System.out.println("Added Successfully: " + added);

        System.out.print("After Adding 35 at index 4: ");
        display(q);

        int removed = removeAtIndex(q, 3);
        System.out.println("Removed Element: " + removed);

        System.out.print("After Removal: ");
        display(q);

        int peeked = peekAtIndex(q, 2);
        System.out.println("Element at index 2: " + peeked);

        System.out.println("Remove at index 10: " + removeAtIndex(q, 10));
        System.out.println("Peek at index -1: " + peekAtIndex(q, -1));

        boolean invalidAdd = addAtIndex(q, 100, 10);
        System.out.println("Add at index 10: " + invalidAdd);
    }
}