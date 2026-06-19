import java.util.*;

class CircularQueue{
    int[] arr;
    int r;
    int f;
    int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }

    void add(int val){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val;
        if(r== arr.length) r = 0;
        size++;
    }

    int remove(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }

        int front = arr[f];
        f++;
        if(f == arr.length) f = 0;
        size--;

        return front;
    }

    void display(){
        if(size == 0) return;

        if(f > r){
            for(int i = f; i < arr.length; i++){
                System.out.print(arr[i]+ " ");
            }

            for(int i = 0; i < r; i++){
                System.out.print(arr[i]+ " ");
            }
        }else{
            for(int i = f; i < r; i++){
                System.out.print(arr[i]+ " ");
            }
        }

        System.out.println();
    }

    int peek(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[f];
    }
}

public class ArrayImplementationOfArray {
   public static void main(String[] args) {
        CircularQueue q = new CircularQueue(6);

        // Add elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.print("Queue: ");
        q.display();

        // Peek
        System.out.println("Front element: " + q.peek());

        // Remove elements
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        System.out.print("Queue after removing 2 elements: ");
        q.display();

        // Add more elements (tests circular nature)
        q.add(60);
        q.add(70);
        q.add(80);

        System.out.print("Queue after adding 60, 70, 80: ");
        q.display();

        // Remove all elements
        System.out.println("\nRemoving all elements:");
        while(q.size > 0){
            System.out.println(q.remove());
        }

        // Try operations on empty queue
        System.out.println("Peek: " + q.peek());
        System.out.println("Remove: " + q.remove());
    }
}
