import java.util.*;

// Leetcode 141

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        LinkedListCycle obj = new LinkedListCycle();

        // Case 1: Cycle present
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        // Creating cycle: 4 -> 2
        head1.next.next.next.next = head1.next;

        System.out.println("Cycle Present (Expected: true): " + obj.hasCycle(head1));

        // Case 2: No cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.println("Cycle Present (Expected: false): " + obj.hasCycle(head2));

        // Case 3: Single node (no cycle)
        ListNode head3 = new ListNode(10);

        System.out.println("Cycle Present (Expected: false): " + obj.hasCycle(head3));

        // Case 4: Single node with cycle
        ListNode head4 = new ListNode(99);
        head4.next = head4;

        System.out.println("Cycle Present (Expected: true): " + obj.hasCycle(head4));
    }
}
