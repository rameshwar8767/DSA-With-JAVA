import java.util.*;

class ListNode{
    int val;
    ListNode next;
    
    ListNode(int val){
        this.val = val;
    }
}

public class MergeSortForLinkedList {

    public static ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(head2);

        return merge(left, right);
    }

    public static ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                current.next = head1;
                head1 = head1.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        current.next = (head1 != null) ? head1 : head2;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        head = mergeSort(head);

        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}
