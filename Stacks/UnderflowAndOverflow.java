import java.util.Stack;

public class UnderflowAndOverflow {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        //Underflow
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();  //Exception in thread "main" java.util.EmptyStackException

    }
}
