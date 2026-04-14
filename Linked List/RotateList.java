import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null){
            return head;
        }

        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        k %= length;
        if( k == 0) return head;

        ListNode slow = head;
        ListNode fast = head;

        for(int i = 0; i <= k; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode a = slow.next;
        slow.next = null;

        ListNode tail = a;

        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = head;

        return a;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original List: ");
        printList(head);

        // Rotate list
        head = rotateRight(head, k);

        System.out.print("Rotated List: ");
        printList(head);
    }
}