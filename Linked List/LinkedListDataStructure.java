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
    }
}
