import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
public class FindFirstNodeOfLoopInLinkedList {

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast= head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                while(fast != slow){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        FindFirstNodeOfLoopInLinkedList obj = new FindFirstNodeOfLoopInLinkedList();

        // Case 1: Cycle present (cycle starts at node with value 2)
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        // Creating cycle: 5 -> 2
        head1.next.next.next.next.next = head1.next;

        ListNode result1 = obj.detectCycle(head1);
        System.out.println("Cycle starts at (Expected: 2): " + 
            (result1 != null ? result1.val : "No Cycle"));

        // Case 2: No cycle
        ListNode head2 = new ListNode(10);
        head2.next = new ListNode(20);
        head2.next.next = new ListNode(30);

        ListNode result2 = obj.detectCycle(head2);
        System.out.println("Cycle starts at (Expected: No Cycle): " + 
            (result2 != null ? result2.val : "No Cycle"));

        // Case 3: Single node with cycle
        ListNode head3 = new ListNode(99);
        head3.next = head3;

        ListNode result3 = obj.detectCycle(head3);
        System.out.println("Cycle starts at (Expected: 99): " + 
            (result3 != null ? result3.val : "No Cycle"));

        // Case 4: Cycle starts at head
        ListNode head4 = new ListNode(7);
        head4.next = new ListNode(8);
        head4.next.next = new ListNode(9);

        // Creating cycle: 9 -> 7
        head4.next.next.next = head4;

        ListNode result4 = obj.detectCycle(head4);
        System.out.println("Cycle starts at (Expected: 7): " + 
            (result4 != null ? result4.val : "No Cycle"));
    }
}
