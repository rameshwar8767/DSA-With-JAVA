import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class IsPalindrome {

    public static boolean isPalindrome(ListNode head){
        ArrayList<Integer> ans = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            ans.add(temp.val);
            temp = temp.next; 
        }

        int start = 0;
        int end = ans.size() - 1;

        while(start <= end){
            if(!ans.get(start).equals(ans.get(end))) return false;
            start++;
            end--;
        }

        return true;
    }

    // Helper to print list
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Example 1: Palindrome list → 1 -> 2 -> 3 -> 2 -> 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);

        System.out.print("List 1: ");
        printList(head1);
        System.out.println("Is Palindrome? " + isPalindrome(head1));

        System.out.println();

        // Example 2: Not a palindrome → 1 -> 2 -> 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.print("List 2: ");
        printList(head2);
        System.out.println("Is Palindrome? " + isPalindrome(head2));
    }
}