import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
// Leetcode 2130
public class MaximumTwinSumOfLinkedList {

    public static int pairSum(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;
        int maxSum = 0;

        while(secondHalf != null){
            int sum = firstHalf.val + secondHalf.val;
            maxSum = Math.max(maxSum, sum);

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return maxSum;
    }

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
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Call function
        int result = pairSum(head);

        // Output result
        System.out.println("Maximum Twin Sum: " + result);
    }
}