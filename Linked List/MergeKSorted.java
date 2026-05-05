import java.util.*;

class ListNode{
    ListNode next;
    int val;

    ListNode(int val){
        this.val = val;
    }
}

// Leetcode 23

public class MergeKSorted {

    public static ListNode mergeKLists(ListNode[] lists){
        if(lists.length == 0) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(int i = 0; i < lists.length; i++){
            arr.add(lists[i]);
        }

        while(arr.size() > 1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a,b);
            arr.add(c);
        }

        return arr.get(0);
    }
    public static ListNode merge(ListNode h1, ListNode h2){
        ListNode i = h1;
        ListNode j = h2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while( i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                k = k.next;
                i = i.next;
            }else{
                k.next = j;
                k = k.next;
                j = j.next;
            }
        }
        if(i != null){
            k.next = i;
        }else{
            k.next = j;
        }

        return dummy.next;
    }
    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        // List 1: 1 -> 4 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        // List 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // List 3: 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        // Array of lists
        ListNode[] lists = new ListNode[]{l1, l2, l3};

        // Merge K lists
        ListNode result = mergeKLists(lists);

        // Print result
        printList(result);
    }
}
