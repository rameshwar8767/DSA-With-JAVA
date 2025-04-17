public class LinkedList1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void  insertAtEnd(int val){
            Node newNode = new Node(val);
            if(head==null){
                head = newNode;
               
            }else{
                tail.next = newNode;
            }
            tail = newNode;
            size++;
        }
        void insertAtPosition(int pos, int val){
            if(pos == 0){
                insertAtStart(val);
                return;
            }else if(pos == size){
                insertAtEnd(val);
                return;
            }else if(pos > size || pos < 0){
                System.out.println("Invalid position");
                return;
            }else{
                Node temp = head;
                for(int i =0; i< pos-1; i++){
                    temp = temp.next;
                }
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            size++;
        }
        int getAtPosition(int pos){
            if(pos < 0 || pos >= size){
                System.out.println("Invalid position");
                return -1;
            }else{
                Node temp = head;
                for(int i =0; i< pos; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
        }
        void printList(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();  // prints new line after printing all elements.
        }
        

        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
                
            }else{
                temp.next =head;
                head = temp;
            }
            size++;
            
        }

    }
    public static void main(String[] args) {
        linkedList ll = new linkedList(); 
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.printList();  // 1 2 3 
       
        ll.insertAtStart(45);
        ll.printList();  // 45 1 2 3

        ll.insertAtPosition(2, 79);
        ll.insertAtPosition(5, 79);
        ll.printList();
        System.out.println(ll.size);
    }
}
