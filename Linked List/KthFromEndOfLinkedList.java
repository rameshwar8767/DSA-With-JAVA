import java.util.*;

public class KthFromEndOfLinkedList {

    public static int getKthFromLast(Node head, int k) {
        if (head == null) return -1;

        Node slow = head;
        Node fast = head;

        // Move fast k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) return -1; // k > length
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    // public static int getKthFromLast(Node head, int k) {
    //     int length = 0;
    //     Node temp = head;
        
    //     while(temp != null){
    //         temp = temp.next;
    //         length++;
    //     }
        
    //     if(k > length) return -1;
        
    //     temp = head;
        
    //     for(int i = 1; i < length-k+1; i++){
    //         temp = temp.next;
    //     }
    //     return temp.data;
        
    // }
    public static void main(String[] args) {
        
    }
}
