import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ConvertBinaryNumberToInteger {
    // Leetcode 1290

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int getDecimalValue(ListNode head) {
        ListNode head1 = reverse(head);
        ListNode temp = head1;

        int ans = 0;
        int i = 0;

        while (temp != null) {
            ans += temp.val * (int) Math.pow(2, i);
            i++;
            temp = temp.next;
        }

        return ans;
    }

    public static void main(String[] args) {

        // Create binary linked list: 1 -> 0 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        ConvertBinaryNumberToInteger obj = new ConvertBinaryNumberToInteger();

        int result = obj.getDecimalValue(head);

        System.out.println("Decimal Value: " + result);
    }
}