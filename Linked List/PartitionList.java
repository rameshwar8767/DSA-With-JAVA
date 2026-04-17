import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
// Lettcode 86
public class PartitionList {

    public static ListNode partition(ListNode head, int x){
        if(head == null || head.next == null) return head;

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-2);

        ListNode temp = head;
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;

        while(temp != null){
            if(temp.val < x){
                temp1.next = temp;
                temp1 = temp1.next;
                temp = temp.next;
            }else{
                temp2.next = temp;
                temp2 = temp2.next;
                temp = temp.next;
            }
        }

        temp2.next = null;

        temp1.next = dummy2.next;
        return dummy1.next;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Example: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;

        System.out.print("Original: ");
        printList(head);

        head = partition(head, x);

        System.out.print("Partitioned: ");
        printList(head);
    }
}
