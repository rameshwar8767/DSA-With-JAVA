import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SymmetricTree {

    // LeetCode 101
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null)
            return true;

        if (t1 == null || t2 == null)
            return false;

        if (t1.val != t2.val)
            return false;

        return isMirror(t1.left, t2.right) &&
               isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {

        // Create a symmetric tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println("Is Symmetric? " + isSymmetric(root));
    }
}