import java.util.*;

class myQueue {
    // GFG

    int[] arr;
    int r;
    int f;
    int size;

    public myQueue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(int x) {
        if (isFull()) return;

        arr[r] = x;
        r = (r + 1) % arr.length;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) return;

        f = (f + 1) % arr.length;
        size--;
    }

    public int getFront() {
        if (isEmpty()) return -1;

        return arr[f];
    }

    public int getRear() {
        if (isEmpty()) return -1;

        int rearIndex = (r - 1 + arr.length) % arr.length;
        return arr[rearIndex];
    }
}

public class QueueUsingArray {
    //GFG
    public static void main(String[] args) {

    myQueue q = new myQueue(5);

    // Enqueue elements
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);

    System.out.println("Front: " + q.getFront());
    System.out.println("Rear: " + q.getRear());

    // Dequeue one element
    q.dequeue();

    System.out.println("\nAfter one dequeue:");
    System.out.println("Front: " + q.getFront());
    System.out.println("Rear: " + q.getRear());

    // Add more elements
    q.enqueue(50);
    q.enqueue(60);

    System.out.println("\nAfter enqueue 50 and 60:");
    System.out.println("Front: " + q.getFront());
    System.out.println("Rear: " + q.getRear());

    // Remove all elements
    while (!q.isEmpty()) {
        System.out.println("Removing: " + q.getFront());
        q.dequeue();
    }

    System.out.println("\nQueue Empty? " + q.isEmpty());
}
}
