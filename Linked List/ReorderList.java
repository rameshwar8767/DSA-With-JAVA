import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ReorderList {

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void reorderList(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node head1 = reverse(slow.next);
        slow.next = null;

        // Merge
        mergeAlternate(head, head1);
    }

    public static void mergeAlternate(Node l1, Node l2) {
        Node curr1 = l1;
        Node curr2 = l2;

        while (curr1 != null && curr2 != null) {
            Node next1 = curr1.next;
            Node next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1; // FIXED

            curr1 = next1;
            curr2 = next2;
        }
    }

    // Helper to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original: ");
        printList(head);

        reorderList(head);

        System.out.print("Reordered: ");
        printList(head);
    }
}