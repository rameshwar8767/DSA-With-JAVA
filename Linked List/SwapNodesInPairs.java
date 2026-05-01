class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class SwapNodesInPairs{

    public static ListNode swapPairs(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            // ⚠️ important step
            prev = first;
        }
        return dummy.next;
    }

    // Helper function to print list
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original List: ");
        printList(head);

        head = swapPairs(head);

        System.out.print("Swapped List: ");
        printList(head);
    }
}