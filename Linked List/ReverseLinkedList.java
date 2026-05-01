class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

// Leecode 206

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;

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

    // Helper function to print linked list
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        head = reverseList(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}