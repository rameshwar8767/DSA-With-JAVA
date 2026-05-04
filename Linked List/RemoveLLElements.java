import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class RemoveLLElements {

    // Leetcode 203

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;

        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next; 
            } else {
                curr = curr.next; 
            }
        }
       
       return dummy.next;
    }
    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        System.out.println("Original List:");
        printList(head);

        // Call function
        head = removeElements(head, val);

        System.out.println("After Removing " + val + ":");
    printList(head);
    }
}
