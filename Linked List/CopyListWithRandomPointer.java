import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    // LeetCode 138

    public Node deepCopy(Node head){
        Node dummy = new Node(-1);
        Node temp1 = head;
        Node temp2 = dummy;

        while(temp1 != null){
            Node newNode= new Node(temp1.val);
            temp2.next = newNode;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return dummy.next;
    }

    public void merge(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null && temp2 != null){
            temp.next = temp1;
            temp = temp1;
            temp1 = temp1.next;

            temp.next = temp2;
            temp = temp2;
            temp2 = temp2.next;
        }
    }

    public void randomConnections(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null ){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp1.next.next;
            if(temp2.next != null) temp2 = temp2.next.next;
        }
    }

    public void spiltList(Node head1){
        Node dummy1 = new Node(-1);
        Node temp1 = dummy1;
        Node dummy2 = new Node(-2);
        Node temp2 = dummy2;
        Node temp = head1;

        while(temp != null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;
        
            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp1.next = null;

    }

    public Node copyRandomList(Node head1) {
        if (head1 == null) return null;
        //Step 1- Create Deep Copy Of Given List without random pointer
        Node head2 = deepCopy(head1);
    
        // Step 2: Alternatively connecting List
        merge(head1,head2);

        // Step 3: Assigning random pointer
        randomConnections(head1,head2);

        // Step 4: Spilting combine List
        spiltList(head1);

        return head2;
    }
    public static void main(String[] args) {

        CopyListWithRandomPointer obj = new CopyListWithRandomPointer();

        // Creating nodes
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        // Connecting next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Connecting random pointers
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        // Original List
        System.out.println("Original List:");
        Node temp = n1;

        while (temp != null) {

            int randomVal = (temp.random != null) ? temp.random.val : -1;

            System.out.println(
                "Node Value = " + temp.val +
                ", Random = " + randomVal
            );

            temp = temp.next;
        }

        // Copy List
        Node copiedHead = obj.copyRandomList(n1);

        // Copied List
        System.out.println("\nCopied List:");
        temp = copiedHead;

        while (temp != null) {

            int randomVal = (temp.random != null) ? temp.random.val : -1;

            System.out.println(
                "Node Value = " + temp.val +
                ", Random = " + randomVal
            );

            temp = temp.next;
        }
    }
}
