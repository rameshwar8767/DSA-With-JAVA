import java.util.*;



public class LLImplementationOfQueue {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10); 
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
    }
}
