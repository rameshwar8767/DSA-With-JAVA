import java.util.*;

class Heap{
    int[] arr;
    int size = 0;
    int index = 1;
    Heap(int capacity){
        arr = new int[capacity+1];
        Arrays.fill(arr, Integer.MAX_VALUE);
    }

    int peek(){
        return arr[1];
    }
    
    void add(int val){
        arr[index] = val;
        int i = index;
        // rearrangement
        while(i != 1){
            if(arr[i/2] > arr[i]){
                int temp = arr[i/2];
                arr[i/2] = arr[i];
                arr[i] = temp;
                i = i/2;
            }else break;
            
        }
        index++;
        
    }
    int size(){
        return index-1;
    }

    void dispaly(){
        for(int i = 1; i < index; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int remove() {

        if (index == 1) {
            System.out.println("Heap is Empty");
            return -1;
        }

        int min = arr[1];

        arr[1] = arr[index - 1];
        index--;

        int i = 1;

        while (2 * i < index) {

            int left = 2 * i;
            int right = 2 * i + 1;

            int smallest = left;

            if (right < index && arr[right] < arr[left]) {
                smallest = right;
            }

            if (arr[i] <= arr[smallest]) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            i = smallest;
        }

        return min;
    }
}

public class MinHeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap(10);

        h.add(10);
        h.add(15);
        h.add(9);
        h.add(4);

        h.dispaly();

        System.out.println(h.remove());

        h.dispaly();
    }
}
