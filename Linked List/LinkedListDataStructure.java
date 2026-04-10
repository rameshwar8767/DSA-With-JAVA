import java.util.*;

class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null)head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }

    int deleteAtHead() {
        if (head == null) return -1;

        int deletedValue = head.val;

        if (head.next != null) {
            head = head.next;
        } else {
            head = null;
            tail = null;
        }

        return deletedValue;
    }

    boolean searchKey(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == key) return true;
            temp = temp.next;
        }
        return false;
    }

    void insertPos(int pos, int val) {

        if (pos == 1) {
            addAtHead(val);
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) return;

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;

        // update tail if inserted at last
        if (newNode.next == null) {
            tail = newNode;
        }
    }
    
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);

        ll.display();
        ll.addAtHead(5);
        ll.display();
        // ll.deleteAtHead();
        // ll.display();
        // ll.deleteAtHead();
        // ll.display();
        // ll.deleteAtHead();
        // ll.display();
        // ll.deleteAtHead();
        // ll.display();
        System.out.println(ll.searchKey(30));
        ll.insertPos(4, 90);
        ll.display();
        
    }
}
