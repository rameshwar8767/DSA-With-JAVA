import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CheckIfCircularLinkedList {
    // Leetcode 141

    public static boolean isCircular(Node head) {

        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Creating nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Linking nodes
        head.next = second;
        second.next = third;

        // Make circular
        third.next = head;

        System.out.println(isCircular(head)); // true
    }
}