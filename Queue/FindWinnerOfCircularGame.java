import java.util.*;

public class FindWinnerOfCircularGame {

    // LeetCode 1823
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() != 1) {

            for (int j = 1; j < k; j++) {
                q.add(q.remove());
            }

            q.remove();
        }

        return q.peek();
    }

    public static void main(String[] args) {

        int n = 5;
        int k = 2;

        int winner = findTheWinner(n, k);

        System.out.println("Winner: " + winner);
    }
}