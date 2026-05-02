import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class IsPalindrome {

    // Reverse Linked List
    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        // Step 3: Compare both halves
        ListNode p1 = head;
        ListNode p2 = head2;

        while (p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

        // public static boolean isPalindrome(ListNode head){
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     ListNode temp = head;

    //     while(temp != null){
    //         ans.add(temp.val);
    //         temp = temp.next; 
    //     }

    //     int start = 0;
    //     int end = ans.size() - 1;

    //     while(start <= end){
    //         if(!ans.get(start).equals(ans.get(end))) return false;
    //         start++;
    //         end--;
    //     }

    //     return true;
    // }
    // Helper to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Example 1: Palindrome
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);

        System.out.print("List 1: ");
        printList(head1);
        System.out.println("Is Palindrome? " + isPalindrome(head1));

        System.out.println();

        // Example 2: Not palindrome
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.print("List 2: ");
        printList(head2);
        System.out.println("Is Palindrome? " + isPalindrome(head2));
    }
}
