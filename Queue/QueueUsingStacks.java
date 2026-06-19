import java.util.*;

public class QueueUsingStacks {

    static class MyQueue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            st1.push(x);
        }

        public int pop() {
            if (empty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }

            int data = st2.pop();

            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }

            return data;
        }

        public int peek() {
            if (empty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }

            int data = st2.peek();

            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }

            return data;
        }

        public boolean empty() {
            return st1.isEmpty();
        }
    }

    // Leetcode 232
    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        // Push elements
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println("Front Element: " + q.peek());

        System.out.println("Removed: " + q.pop());
        System.out.println("Removed: " + q.pop());

        System.out.println("Front Element: " + q.peek());

        q.push(50);
        q.push(60);

        System.out.println("\nRemoving all elements:");

        while (!q.empty()) {
            System.out.println(q.pop());
        }

        System.out.println("\nIs Queue Empty? " + q.empty());
    }
}