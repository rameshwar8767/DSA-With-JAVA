import java.util.*;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenMultiLevelDoublyLinkedList {

    // LeetCode 430
    public static Node flatten(Node head) {

        if (head == null) return head;

        Node curr = head;

        while (curr != null) {

            if (curr.child == null) {
                curr = curr.next;
            } else {

                Node nextNode = curr.next;

                Node childNode = flatten(curr.child);

                curr.child = null;
                curr.next = childNode;
                childNode.prev = curr;

                Node temp = childNode;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = nextNode;

                if (nextNode != null) {
                    nextNode.prev = temp;
                }

                curr = nextNode;
            }
        }

        return head;
    }

    // Print Doubly Linked List
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        /*
            Creating Multilevel List

            1 - 2 - 3 - 4 - 5
                    |
                    7 - 8 - 9
                        |
                        11 - 12
        */

        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        n1.val = 1;
        n2.val = 2;
        n3.val = 3;
        n4.val = 4;
        n5.val = 5;

        // Main list connections
        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        // Child list
        Node n7 = new Node();
        Node n8 = new Node();
        Node n9 = new Node();

        n7.val = 7;
        n8.val = 8;
        n9.val = 9;

        n7.next = n8;
        n8.prev = n7;

        n8.next = n9;
        n9.prev = n8;

        // Attach child to node 3
        n3.child = n7;

        // Second level child
        Node n11 = new Node();
        Node n12 = new Node();

        n11.val = 11;
        n12.val = 12;

        n11.next = n12;
        n12.prev = n11;

        // Attach child to node 8
        n8.child = n11;

        System.out.println("Original Multilevel List Flattened:");

        Node head = flatten(n1);

        printList(head);
    }
}