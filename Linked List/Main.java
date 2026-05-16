import java.util.*;

// Split a Linked List into two halves


// Node class
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

// Generic Pair class
class Pair<U, V> {
    U first;
    V second;

    Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

// Solution class
class Solution {

    public Pair<Node, Node> splitList(Node head) {

        // Edge case
        if (head == null) {
            return new Pair<>(null, null);
        }

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // For even number of nodes
        if (fast.next.next == head) {
            fast = fast.next;
        }

        // Heads of two halves
        Node head1 = head;
        Node head2 = slow.next;

        // Make first half circular
        slow.next = head1;

        // Make second half circular
        fast.next = head2;

        return new Pair<>(head1, head2);
    }
}

// Main class
public class Main {

    // Function to print circular linked list
    static void printCircularList(Node head) {
        if (head == null) return;

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        // Create circular linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Make circular
        head.next.next.next.next.next = head;

        Solution obj = new Solution();

        Pair<Node, Node> result = obj.splitList(head);

        Node firstHalf = result.first;
        Node secondHalf = result.second;

        System.out.println("First Half:");
        printCircularList(firstHalf);

        System.out.println("Second Half:");
        printCircularList(secondHalf);
    }
}