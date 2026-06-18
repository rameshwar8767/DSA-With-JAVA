import java.util.*;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class MyQueue {
    Node head;
    Node tail;
    int size;


    int remove() {
        if (size == 0) return -1;

        int removed = head.val;
        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return removed;
    }
    int peek(){
        if(size == 0) return -1;
        else return head.val;
    }
    void add(int val){
        Node temp = new Node(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
