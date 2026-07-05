class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class CheckCompletenessOfBinaryTree {

    // LeetCode 958

    static int s;

    // Count total nodes
    public static int size(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }

    // Check Complete Binary Tree
    public static boolean isCompleteTree(TreeNode root) {
        s = size(root);
        return isCBT(root, 1);
    }

    public static boolean isCBT(TreeNode root, int index) {

        if (root == null)
            return true;

        if (index > s)
            return false;

        return isCBT(root.left, 2 * index)
                && isCBT(root.right, 2 * index + 1);
    }

    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \   /
            4   5 6

            Complete Binary Tree
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);

        if (isCompleteTree(root))
            System.out.println("Complete Binary Tree");
        else
            System.out.println("Not Complete Binary Tree");
    }
}