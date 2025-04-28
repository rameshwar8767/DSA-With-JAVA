import java.util.Stack;

public class basicsOfStacks {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
