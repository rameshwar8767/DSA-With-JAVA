import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CircularListTraversal {

    public static void printList(Node head) {

        if (head == null) return;

        Node temp = head;

        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        // Creating nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Connecting nodes
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Making circular linked list
        fourth.next = first;

        // Printing circular linked list
        printList(first);
    }
}