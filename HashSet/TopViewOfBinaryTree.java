import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
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

public class TopViewOfBinaryTree {

    // GFG
    public static ArrayList<Integer> topView(Node root) {

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

            // Store first node at each horizontal distance
            if (!map.containsKey(dist)) {
                map.put(dist, node.data);
            }

            if (node.left != null) {
                q.add(new Pair(node.left, dist - 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, dist + 1));
            }
        }

        for (int i = minDist; i <= maxDist; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
                  \
                   8

        Top View: 4 2 1 3 7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.right.right = new Node(8);

        ArrayList<Integer> result = topView(root);

        System.out.println("Top View:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}