import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class MergeTwoSortedLists{

    // Leetcode 21
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
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

        // Creating first linked list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating second linked list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge the lists
        ListNode mergedHead = mergeTwoLists(list1, list2);

        // Print merged list
        System.out.print("Merged List: ");
        printList(mergedHead);
    }
    
}