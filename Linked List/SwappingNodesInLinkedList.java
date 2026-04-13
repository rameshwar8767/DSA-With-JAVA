import java.util.*;

// Leetcode 1721

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class SwappingNodesInLinkedList {

    public static ListNode swapNodes(ListNode head, int k) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Move fast to kth node
        for (int i = 1; i < k; i++) {
            if (fast.next == null) return head; // safety check
            fast = fast.next;
        }

        // Store kth node from start
        ListNode first = fast;

        // Move fast to end, slow to kth from end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Swap values
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        printList(head);

        head = swapNodes(head, 2);

        System.out.print("After Swap: ");
        printList(head);
    }
}