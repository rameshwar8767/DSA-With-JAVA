import java.util.*;

class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        q.add(x);

        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return q.remove();
    }

    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public int size() {
        return q.size();
    }
}

public class StackUsingQueue {
    // Leetcode 225

    public static void main(String[] args) {

        MyStack st = new MyStack();

        // Push elements
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Top Element: " + st.top()); // 40
        System.out.println("Stack Size: " + st.size());

        // Pop elements
        System.out.println("Popped: " + st.pop()); // 40
        System.out.println("Popped: " + st.pop()); // 30

        System.out.println("\nTop Element: " + st.top()); // 20
        System.out.println("Stack Size: " + st.size());

        // Push more elements
        st.push(50);
        st.push(60);

        System.out.println("\nTop Element after pushing 50 and 60: " + st.top()); // 60

        // Remove all elements
        System.out.println("\nRemoving all elements:");
        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("\nIs Stack Empty? " + st.empty());

        // Test on empty stack
        System.out.println("Top: " + st.top());
        System.out.println("Pop: " + st.pop());
    }
}