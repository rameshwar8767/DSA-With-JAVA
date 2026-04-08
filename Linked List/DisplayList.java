import java.util.*;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class DisplayList {

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        
    }

    public static int getAtIndex(Node head, int index){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == index){
                return temp.val;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }
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
        // display(a);
        System.out.println(getAtIndex(a, 3));
    }
}
