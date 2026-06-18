import java.util.*;

public class BasicsOfQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}