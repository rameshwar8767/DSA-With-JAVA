import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Implementation {
    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        System.out.println("Root: " + a.val);
        System.out.println("Left Child: " + a.left.val);
        System.out.println("Right Child: " + a.right.val);
        System.out.println("Left Left: " + a.left.left.val);
        System.out.println("Left Right: " + a.left.right.val);
        System.out.println("Right Left: " + a.right.left.val);
        System.out.println("Right Right: " + a.right.right.val);
    }
}