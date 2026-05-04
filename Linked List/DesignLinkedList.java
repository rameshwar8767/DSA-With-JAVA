class MyLinkedList {

    // Leetcode 707

    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    ListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;

        ListNode temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);

        if(head == null){
            head = newNode;
        }else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0) index = 0;   
        if(index > size) return;

        if(index == 0){
            addAtHead(val);
            return;
        }

        ListNode temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0){
            head = head.next;
        } else {
            ListNode temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
}

public class DesignLinkedList {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        // Add elements
        list.addAtHead(10);     // 10
        list.addAtTail(20);     // 10 -> 20
        list.addAtTail(30);     // 10 -> 20 -> 30

        System.out.println("Initial List:");
        printList(list);

        // Add at index
        list.addAtIndex(1, 15); // 10 -> 15 -> 20 -> 30
        System.out.println("After addAtIndex(1, 15):");
        printList(list);

        // Get values
        System.out.println("Value at index 2: " + list.get(2)); // 20

        // Delete
        list.deleteAtIndex(1); // remove 15
        System.out.println("After deleteAtIndex(1):");
        printList(list);

        // Edge case: add at index 0
        list.addAtIndex(0, 5); // 5 -> 10 -> 20 -> 30
        System.out.println("After addAtIndex(0, 5):");
        printList(list);

        // Edge case: invalid delete
        list.deleteAtIndex(10); // no change
        System.out.println("After invalid delete:");
        printList(list);
    }

    // Helper print function
    public static void printList(MyLinkedList list) {
        MyLinkedList.ListNode temp = list.head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

