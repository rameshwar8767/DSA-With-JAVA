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

    int get(int idx){
        Node temp = head;

        for(int i = 0; i < idx; i++){
            if(temp == null) return -1;
            temp = temp.next;
        }

        return (temp != null) ? temp.val : -1;
    }
    
    int delete(int idx){

        // Case 1: delete head
        if(idx == 0){
            return deleteAtHead();
        }

        Node temp = head;

        for(int i = 0; i < idx - 1; i++){
            if(temp == null || temp.next == null) return -1;
            temp = temp.next;
        }

        Node nodeToDelete = temp.next;
        if(nodeToDelete == null) return -1;

        temp.next = nodeToDelete.next;

        // update tail
        if(temp.next == null){
            tail = temp;
        }

        return nodeToDelete.val;
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
        System.out.println(ll.get(3));
        System.out.println(ll.delete(3));
        
    }
}
