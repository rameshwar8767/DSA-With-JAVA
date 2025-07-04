import java.util.*;

public class Implementation {
    public static class Node{
        int val; //0
        Node left; // null
        Node right; // null
        
        public Node(int val){
            this.val = val; 
        }
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " -> ");
        if(root.left != null) System.out.print(root.left.val+" , ");
        if(root.right != null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    // Preorder Traversal
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    

    // Postorder Traversal
    public static void postorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        postorder(root.left);
        postorder(root.right);
    }

    // Print nth level element
    public static void bfs(Node root){
        Queue <Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        d.right = e;
        Node f = new Node(7);
        e.right = f;
        // preorder(root);
        // inorder(root);
        // postorder(root);
        bfs(root);
        // System.out.println(root.val);
        // display(root);
        // System.out.println(size(root));
    }
}
