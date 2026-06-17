import java.util.*;

public class StockSpanProblem {

    public class Pair {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        span[0] = 1;

        Stack<Pair> st = new Stack<>();
        Pair p = new Pair(arr[0], 0);
        st.push(p);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek().val <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                span[i] = i - (-1);
            else
                span[i] = i - st.peek().index;

            Pair p1 = new Pair(arr[i], i);
            st.push(p1);
        }

        ArrayList<Integer> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ans.add(span[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        StockSpanProblem obj = new StockSpanProblem();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        ArrayList<Integer> result = obj.calculateSpan(prices);

        System.out.println("Stock Span:");
        for (int span : result) {
            System.out.print(span + " ");
        }
    }
}