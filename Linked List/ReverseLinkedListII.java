import java.util.*;

class ListNode{
    ListNode next;
    int val;

    ListNode(int val){
        this.val = val;
    }
}

public class ReverseLinkedListII {
    // Leetcode 92
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right){
        if(head == null) return head;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;

        for(int i =1; i < left; i++){
            temp = temp.next;
        }

        ListNode tail1 = temp;
        ListNode head1 = temp.next;

        temp = dummy;

        for(int i = 1; i <= right; i++){
            temp = temp.next;
        }

        ListNode tail2 = temp;
        ListNode head2 = temp.next;

        tail2.next = null;

        ListNode newHead = reverse(head1);

        tail1.next = newHead;
        head1.next = head2;

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
        // Create linked list
        // 1 -> 2 -> 3 -> 4 -> 5

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        int left = 2;
        int right = 4;

        head = reverseBetween(head, left, right);

        System.out.println("After Reversing Between " + left + " and " + right + ":");
        printList(head);
    }
}
