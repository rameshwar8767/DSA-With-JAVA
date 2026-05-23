import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class DeleteNodeInCircularList {

    // Delete node from Circular Linked List
    public static Node deleteNode(Node head, int key) {

        if (head == null)
            return null;

        Node curr = head;
        Node prev = null;

        // Case 1 : Delete head node
        if (head.data == key) {

            // Single node
            if (head.next == head)
                return null;

            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            head = head.next;

            return head;
        }

        // Case 2 : Delete non-head node
        prev = head;
        curr = head.next;

        while (curr != head) {

            if (curr.data == key) {
                prev.next = curr.next;
                return head;
            }

            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    // Insert node at end
    public static Node insertEnd(Node head, int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

        return head;
    }

    // Print Circular Linked List
    public static void printList(Node head) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    public static void main(String[] args) {

        Node head = null;

        // Insert nodes
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        head = insertEnd(head, 40);

        System.out.println("Original Circular Linked List:");
        printList(head);

        // Delete node
        int key = 30;

        head = deleteNode(head, key);

        System.out.println("\nAfter deleting " + key + ":");
        printList(head);

        // Delete head node
        head = deleteNode(head, 10);

        System.out.println("\nAfter deleting head node 10:");
        printList(head);
    }
}