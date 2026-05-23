import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedListClass {

    public static int length = 0;
    // Add node at head
    public static ListNode addAtHead(ListNode head,int val){
        ListNode node = new ListNode(val);
        if (head == null) {
            length++;
            return node;
        }
        node.next = head;
        head.prev = node;
        length++;
        return node;
    }

    // Add node at tail
    public static ListNode addAtTail(ListNode head,int val){
        ListNode node = new ListNode(val);
        if (head == null){
            length++;
            return node;
        }
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = node;
        node.prev = tail;
        length++;
        return head;
    }

    // Add node at index
    public static ListNode addAtIndex(ListNode head,int val,int index){
        // Invalid index
        if (index < 0 || index > length) {
            System.out.println("Invalid Index");
            return head;
        }

        // Add at tail
        if(index == length) return addAtTail(head, val);

        // Add at head
        if(index == 0) return addAtHead(head, val);

        ListNode node = new ListNode(val);
        ListNode temp = head;
        
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        ListNode nextNode = temp.next;

        temp.next = node;
        node.prev = temp;

        node.next = nextNode;
        nextNode.prev = node;

        length++;

        return head;
    }

    // Delete head
    public static ListNode deleteHead(ListNode head){
        if (head == null) {
            return null;
        }
        if(head.next == null){
            length--;
            return null;
        }
        head = head.next;
        head.prev = null;
        length--;
        return head;
    }

    // Delete tail
    public static ListNode deleteTail(ListNode head){
        if (head == null) {
            return null;
        }

        if(head.next == null){
            length--;
            return null;
        }

        ListNode tail = head;
        while(tail.next.next != null){
            tail = tail.next;
        }

        tail.next.prev = null;
        tail.next = null;
        length--;
        return head;
    }

    // Delete node at index
    public static ListNode deleteAtIndex(ListNode head,int index){
        if(index < 0 || index >= length){
            System.out.println("Invalid index");
            return head;
        }

        if(index == 0){
            length--;
            return deleteHead(head);
        }

        if (index == length-1) {
            length--;
            return deleteTail(head);
        }

        ListNode temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }

        ListNode deleteNode = temp.next;
        ListNode nextNode = deleteNode.next;
        temp.next = nextNode;
        nextNode.prev = temp;

        length--;
        return head;
    }
    // Display Doubly Linked List (Forward)
    public static void display(ListNode head) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display Doubly Linked List in Reverse
    public static void displayReverse(ListNode head) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode temp = head;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }
    
    public static void main(String[] args) {

        ListNode head = null;

        // Add at head
        head = addAtHead(head, 30);
        head = addAtHead(head, 20);
        head = addAtHead(head, 10);

        System.out.println("After addAtHead:");
        display(head);

        // Add at tail
        head = addAtTail(head, 40);
        head = addAtTail(head, 50);

        System.out.println("\nAfter addAtTail:");
        display(head);

        // Add at index
        head = addAtIndex(head, 25, 2);

        System.out.println("\nAfter addAtIndex(25, 2):");
        display(head);

        // Display reverse
        System.out.println("\nDisplay Reverse:");
        displayReverse(head);

        // Delete head
        head = deleteHead(head);

        System.out.println("\nAfter deleteHead:");
        display(head);

        // Delete tail
        head = deleteTail(head);

        System.out.println("\nAfter deleteTail:");
        display(head);

        // Delete at index
        head = deleteAtIndex(head, 2);

        System.out.println("\nAfter deleteAtIndex(2):");
        display(head);

        // Final reverse display
        System.out.println("\nFinal Reverse Display:");
        displayReverse(head);

        // Print length
        System.out.println("\nLength of DLL: " + length);
    }
}
