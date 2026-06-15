import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNodesFromLinkedList {

    // Leetcode 2487

    public static ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();

        ListNode curr = head;

        while (curr != null) {

            while (!st.isEmpty() && st.peek().val < curr.val) {
                st.pop();
            }

            st.push(curr);
            curr = curr.next;
        }

        ListNode newHead = null;

        while (!st.isEmpty()) {
            ListNode node = st.pop();
            node.next = newHead;
            newHead = node;
        }

        return newHead;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 5 -> 2 -> 13 -> 3 -> 8
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        System.out.println("Original List:");
        printList(head);

        head = removeNodes(head);

        System.out.println("After Removing Nodes:");
        printList(head);
    }
}