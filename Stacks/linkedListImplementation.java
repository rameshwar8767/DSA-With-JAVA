public class linkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack {
        private Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int data = head.val;
            head = head.next;
            size--;
            return data;
        }
        void displayReverse(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayRec(Node h){
            if(h == null) return ;
            displayRec(h.next);
            System.out.println(h.val);
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
        
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.peek());
    }
}
