import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class ReverseDoublyLinkedList {
    // GFG

    public static Node reverse(Node head) {

        Node prevNode = null;
        Node curr = head;

        while (curr != null) {

            Node nextNode = curr.next;

            // Reverse next pointer
            curr.next = prevNode;

            // Update prev pointer
            curr.prev = nextNode;

            // Move forward
            prevNode = curr;
            curr = nextNode;
        }

        return prevNode;
    }
    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Connect nodes
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        // Print original DLL
        System.out.println("Original Doubly Linked List:");

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");

        // Reverse DLL
        head = reverse(head);

        // Print reversed DLL
        System.out.println("\nReversed Doubly Linked List:");

        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
