import java.util.*;

public class BSTToMaxHeap {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int index;

    // Store BST elements in sorted order
    static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // Assign values in postorder
    static void postorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;

        postorder(root.left, list);
        postorder(root.right, list);

        root.data = list.get(index++);
    }

    // Convert BST to Max Heap
    static void convertToMaxHeapUtil(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        index = 0;

        postorder(root, list);
    }

    // Print tree in level order
    static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            System.out.print(curr.data + " ");

            if (curr.left != null)
                q.offer(curr.left);

            if (curr.right != null)
                q.offer(curr.right);
        }
    }

    public static void main(String[] args) {

        /*
                 4
               /   \
              2     6
             / \   / \
            1   3 5   7
        */

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        System.out.println("Before Conversion (Level Order):");
        levelOrder(root);

        convertToMaxHeapUtil(root);

        System.out.println("\nAfter Conversion to Max Heap (Level Order):");
        levelOrder(root);
    }
}