import java.util.*;

// Leetcode 160
class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
    
}


public class IntersectionOfTwoLinkedList {

    // Approach 1
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode tempA = headA;
        ListNode tempB = headB;

        int lengthA = 0;
        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }

        int lengthB = 0;
        while(tempB != null){
            lengthB++;
            tempB = tempB.next;
        }

        int d = 0;
        tempA = headA;
        tempB = headB;

        if(lengthA > lengthB){
            d = lengthA - lengthB;
            for(int i = 1; i <= d; i++){
                tempA = tempA.next;
            }
        }else{
            d = lengthB - lengthA;
            for(int i = 1; i <= d; i++){
                tempB = tempB.next;
            }
        }

        while(tempA != null && tempB != null){
            if(tempA == tempB) return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;

        
    }

    // Approach 2
    // public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if(headA == null || headB == null) return null;
    //     ListNode tempA = headA;
    //     ListNode tempB = headB;

        
    //     while(tempA != tempB){
    //         if(tempA == null){
    //             tempA = headB;
    //         }else{
    //             tempA = tempA.next;
    //         }

    //         if(tempB == null){
    //             tempB = headA;
    //         }else{
    //             tempB = tempB.next;
    //         }
    //     }
    //     return tempA;

        
    // }
    public static void main(String[] args) {

    // Common part (intersection)
    ListNode common = new ListNode(8);
    common.next = new ListNode(9);

    // List A: 1 → 2 → 3 → 4 → 5 → 8 → 9
    ListNode headA = new ListNode(1);
    headA.next = new ListNode(2);
    headA.next.next = new ListNode(3);
    headA.next.next.next = new ListNode(4);
    headA.next.next.next.next = new ListNode(5);
    headA.next.next.next.next.next = common;

    // List B: 6 → 7 → 8 → 9
    ListNode headB = new ListNode(6);
    headB.next = new ListNode(7);
    headB.next.next = common;

    // Call function
    ListNode intersection = getIntersectionNode(headA, headB);

    // Output
    if (intersection != null) {
        System.out.println("Intersection at node with value: " + intersection.val);
    } else {
        System.out.println("No intersection");
    }
}
}
