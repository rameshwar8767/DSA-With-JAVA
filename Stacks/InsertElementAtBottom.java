import java.util.*;

public class InsertElementAtBottom {

    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> s = new Stack<>();

        while (!st.isEmpty()) {
            s.push(st.pop());
        }

        st.push(x);

        while (!s.isEmpty()) {
            st.push(s.pop());
        }

        return st;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        int x = 4;

        st = insertAtBottom(st, x);

        System.out.println("Stack after inserting at bottom:");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}