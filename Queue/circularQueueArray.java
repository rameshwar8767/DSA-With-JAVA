import java.util.*;

public class circularQueueArray {
    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[10];

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            }
            if (size == 0) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % arr.length;
            }
            arr[rear] = val;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            if (size == 1) {
                front = rear = -1;
            } else {
                front = (front + 1) % arr.length;
            }
            size--;
            return val;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % arr.length;
                System.out.print(arr[idx] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(4);
        q.add(3);
        q.display();
        q.remove();
        q.display();
    }
}
