import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class SumOfBinaryTree {
    // GFG

    public static int sumBT(Node root) {
        if (root == null)
            return 0;

        return root.data + sumBT(root.left) + sumBT(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Sum = " + sumBT(root));
    }
}