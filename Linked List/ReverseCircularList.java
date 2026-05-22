import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class ReverseCircularList {
    // GFG

    public static Node reverseCircular(Node head) {
        
        // Empty list or single node
        if(head == null || head.next == head) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        do {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } while(curr != head);

        // Fix links
        head.next = prev;

        // New head
        head = prev;

        return head;
    }
    public static void printCircular(Node head) {

        if(head == null) {
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        // Creating circular linked list
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head; // Circular link

        System.out.println("Original Circular Linked List:");
        printCircular(head);

        // Reverse
        head = reverseCircular(head);

        System.out.println("Reversed Circular Linked List:");
        printCircular(head);
    }
}
