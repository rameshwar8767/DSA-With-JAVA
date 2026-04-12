import java.util.*;

// Leetcode 19

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RemoveKthNodeFromEndOfLinkedList {

    // public static ListNode removeNthFromEnd(ListNode head, int n) {
    //     int length = 0;
    //     ListNode temp = head;

    //     while(temp != null){
    //         length++;
    //         temp = temp.next;
    //     }

    //     if(n == length) return head.next;
    //     temp = head;
    //     for(int i = 1; i < length - n; i++){
    //         temp = temp.next;
    //     }

    //     temp.next = temp.next.next;
    //     return head;
    // }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        for(int i = 0; i < n; i++){
            if(fast == null) return null;
            fast = fast.next;
        }

        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (prev == null) return head.next;
        prev.next = slow.next;
        return head;
    }
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Remove 2nd node from end (node with value 4)

        head = removeNthFromEnd(head, n);

        // Print updated linked list
        System.out.print("Updated List: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
