import java.util.*;

public class PriorityQueueSTL {
    public static void main(String[] args) {

        //Minheap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(13);
        pq.add(4);
        pq.add(10);
        pq.add(11);
        System.out.println(pq.peek());
        pq.add(3);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

        for(int ele : pq){
            System.out.print(ele+" ");
        }


    }
}
