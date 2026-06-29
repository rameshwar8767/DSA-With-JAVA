import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class MaxAndMinElementInBinaryTree {
    // GFG

    public static int findMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int left = findMax(root.left);
        int right = findMax(root.right);

        return Math.max(root.data, Math.max(left, right));
    }

    public static int findMin(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        int left = findMin(root.left);
        int right = findMin(root.right);

        return Math.min(root.data, Math.min(left, right));
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(8);

        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println("Maximum Element: " + findMax(root));
        System.out.println("Minimum Element: " + findMin(root));
    }
}