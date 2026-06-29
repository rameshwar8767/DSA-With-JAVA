import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class LevelOfNodeInBinaryTree {
    // GFG

    int getLevel(Node node, int data) {
        return findLevel(node, data, 1);
    }

    int findLevel(Node root, int data, int level) {

        if (root == null)
            return 0;

        if (root.data == data)
            return level;

        int left = findLevel(root.left, data, level + 1);

        if (left != 0)
            return left;

        return findLevel(root.right, data, level + 1);
    }

    public static void main(String[] args) {

        // Creating Binary Tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        LevelOfNodeInBinaryTree obj = new LevelOfNodeInBinaryTree();

        System.out.println("Level of 1 = " + obj.getLevel(root, 1));
        System.out.println("Level of 2 = " + obj.getLevel(root, 2));
        System.out.println("Level of 5 = " + obj.getLevel(root, 5));
        System.out.println("Level of 7 = " + obj.getLevel(root, 7));
        System.out.println("Level of 10 = " + obj.getLevel(root, 10));
    }
}