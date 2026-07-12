import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    Node node;
    int dist;

    Pair(Node node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

public class BottomViewOfBinaryTree {

    public static ArrayList<Integer> bottomView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        int minDist = 0;
        int maxDist = 0;

        while (!q.isEmpty()) {

            Pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;

            minDist = Math.min(minDist, dist);
            maxDist = Math.max(maxDist, dist);

            // Overwrite for Bottom View
            map.put(dist, node.data);

            if (node.left != null)
                q.add(new Pair(node.left, dist - 1));

            if (node.right != null)
                q.add(new Pair(node.right, dist + 1));
        }

        for (int i = minDist; i <= maxDist; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }

    public static void main(String[] args) {

        /*
                  20
                /    \
               8      22
              / \       \
             5   3       25
                / \
               10 14

        Bottom View: 5 10 3 14 25
        */

        Node root = new Node(20);

        root.left = new Node(8);
        root.right = new Node(22);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.right = new Node(25);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<Integer> result = bottomView(root);

        System.out.println("Bottom View of Binary Tree:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}