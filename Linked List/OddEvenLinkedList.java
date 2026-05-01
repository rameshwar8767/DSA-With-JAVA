import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode temp = head;
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;

        int index = 1;

        while(temp != null){
            if(index % 2 != 0){
                temp1.next = temp;
                temp = temp.next;
                temp1 = temp1.next;
            }else{
                temp2.next = temp;
                temp2 = temp2.next;
                temp = temp.next;
            }
            index++;
        }
        
        temp1.next = null;
        temp2.next = null;

        temp1.next = dummy2.next;

        return dummy1.next;
        
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

        // Create Linked List: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call function
        ListNode result = oddEvenList(head);

        // Print result
        System.out.print("Result: ");
        printList(result);
    }
}
