import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class SortList {

    // Leetcode 148

    public static ListNode sortLinkedList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head1 = slow.next;
        slow.next = null;
        
        ListNode left = sortLinkedList(head);
        ListNode right = sortLinkedList(head1);

        return merge(left, right);
        
    }

    public static ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                current.next = head1;
                current = current.next;
                head1 = head1.next;
            }else{
                current.next = head2;
                current = current.next;
                head2 = head2.next;
            }
        }

        if(head1 != null) current.next = head1;
        else current.next = head2;

        return dummy.next;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Create linked list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.print("Original List: ");
        printList(head);

        head = sortLinkedList(head);

        System.out.print("Sorted List: ");
        printList(head);
    }
}
