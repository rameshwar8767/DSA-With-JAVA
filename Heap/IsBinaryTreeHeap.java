import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class IsBinaryTreeHeap {

    static int s;

    // Calculate total nodes
    private static int size(Node root) {
        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }

    // Main Function
    public boolean isHeap(Node root) {

        s = size(root);

        return isMaxHeap(root) && isCBT(root, 1);
    }

    // Check Max Heap Property
    private static boolean isMaxHeap(Node root) {

        if (root == null)
            return true;

        int leftVal = (root.left != null) ? root.left.data : Integer.MIN_VALUE;
        int rightVal = (root.right != null) ? root.right.data : Integer.MIN_VALUE;

        if (root.data <= leftVal || root.data <= rightVal)
            return false;

        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }

    // Check Complete Binary Tree
    private static boolean isCBT(Node root, int index) {

        if (root == null)
            return true;

        if (index > s)
            return false;

        return isCBT(root.left, 2 * index)
                && isCBT(root.right, 2 * index + 1);
    }

    public static void main(String[] args) {

        /*
                  10
                /    \
               9      8
              / \    /
             7   6  5

        This is a Max Heap.
        */

        Node root = new Node(10);

        root.left = new Node(9);
        root.right = new Node(8);

        root.left.left = new Node(7);
        root.left.right = new Node(6);

        root.right.left = new Node(5);

        IsBinaryTreeHeap obj = new IsBinaryTreeHeap();

        if (obj.isHeap(root))
            System.out.println("Binary Tree is a Heap");
        else
            System.out.println("Binary Tree is NOT a Heap");
    }
}