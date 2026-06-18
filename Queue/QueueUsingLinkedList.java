import java.util.*;

public class QueueUsingLinkedList {

    // GFG 

    public static void main(String[] args) {

        myQueue q = new myQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.getFront()); // 10
        System.out.println("Size: " + q.size());      // 3

        System.out.println("Removed: " + q.dequeue()); // 10
        System.out.println("Front: " + q.getFront());  // 20

        System.out.println("Removed: " + q.dequeue()); // 20
        System.out.println("Removed: " + q.dequeue()); // 30

        System.out.println("Is Empty: " + q.isEmpty()); // true
    }
}

// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {

    Node head;
    Node tail;
    int size;

    public myQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int x) {
        Node temp = new Node(x);

        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    public int dequeue() {
        if (size == 0)
            return -1;

        int removed = head.data;
        head = head.next;
        size--;

        if (size == 0)
            tail = null;

        return removed;
    }

    public int getFront() {
        if (size == 0)
            return -1;

        return head.data;
    }

    public int size() {
        return size;
    }
}