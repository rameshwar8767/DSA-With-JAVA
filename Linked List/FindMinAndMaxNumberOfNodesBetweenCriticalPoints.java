import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class FindMinAndMaxNumberOfNodesBetweenCriticalPoints {

    // LeetCode 2058

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        if(head == null || head.next == null || head.next.next == null) return ans;
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode next = curr.next;
        int index = 1;
        int firstIndex = -1;
        int lastIndex = -1;
        int min = Integer.MAX_VALUE;
        int max = -1;

        while(next != null){
            if((prev.val < curr.val && curr.val > next.val) || prev.val > curr.val && curr.val < next.val){
                if(firstIndex == -1){
                    firstIndex = index;
                }
                if(lastIndex != -1){
                    int dis = index - lastIndex;
                    min = Math.min(min,dis);
                }
                lastIndex = index;
            }
            prev = prev.next;
            curr = curr.next;
            next = next.next;
            index++;
    
        }
        max = lastIndex - firstIndex;
        if(max == 0) max = -1;
        if(min == Integer.MAX_VALUE) min = -1;
        ans[0] = min;
        ans[1] = max;
        return ans;
    }

    public static void main(String[] args) {
        // Create Linked List:
        // 5 -> 3 -> 1 -> 2 -> 5 -> 1 -> 2

        ListNode head = new ListNode(5);

        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);

        int[] ans = nodesBetweenCriticalPoints(head);

        System.out.println("Minimum Distance: " + ans[0]);
        System.out.println("Maximum Distance: " + ans[1]);
    }
}