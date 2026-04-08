import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList {
    public static void main(String[] args) {
        // 10 -> 20 -> 30 -> 40 -> 50
        Node a = new Node(10);    // a.val = 10;
        Node b = new Node(20);    // b.val = 20;
        Node c = new Node(30);    // c.val = 30;
        Node d = new Node(40);    // d.val = 40;
        Node e = new Node(50);    // e.val = 50;
        
        // Connect Node(Link Karenge);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(a);
        System.out.println(b.next);
        System.out.println(c);
    }
}
