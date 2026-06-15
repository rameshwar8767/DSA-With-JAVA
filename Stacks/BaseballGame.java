import java.util.*;

public class BaseballGame {

    // Leetcode 682

    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                st.pop();

            } else if (op.equals("D")) {
                st.push(st.peek() * 2);

            } else if (op.equals("+")) {
                int first = st.pop();
                int second = st.peek();

                st.push(first);
                st.push(first + second);

            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};

        int result = calPoints(operations);

        System.out.println("Total Score: " + result);
    }
}