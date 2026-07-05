import java.util.*;

class Heap {

    int[] arr;
    int index = 1;

    Heap(int capacity) {
        arr = new int[capacity + 1];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    int peek() {
        return arr[1];
    }

    void add(int val) {

        arr[index] = val;
        int i = index;

        // Heapify Up
        while (i != 1) {

            if (arr[i / 2] < arr[i]) {

                int temp = arr[i / 2];
                arr[i / 2] = arr[i];
                arr[i] = temp;

                i = i / 2;

            } else
                break;
        }

        index++;
    }

    int size() {
        return index - 1;
    }

    void display() {
        for (int i = 1; i < index; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    int remove() {

        if (index == 1) {
            System.out.println("Heap is Empty");
            return -1;
        }

        int max = arr[1];

        arr[1] = arr[index - 1];
        index--;

        int i = 1;

        // Heapify Down
        while (2 * i < index) {

            int left = 2 * i;
            int right = 2 * i + 1;

            int largest = left;

            if (right < index && arr[right] > arr[left]) {
                largest = right;
            }

            if (arr[i] >= arr[largest])
                break;

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            i = largest;
        }

        return max;
    }
}

public class MaxHeapImplementation {

    public static void main(String[] args) {

        Heap h = new Heap(10);

        h.add(10);
        h.add(15);
        h.add(9);
        h.add(4);
        h.add(30);
        h.add(20);

        h.display();

        System.out.println("Removed: " + h.remove());

        h.display();
    }
}