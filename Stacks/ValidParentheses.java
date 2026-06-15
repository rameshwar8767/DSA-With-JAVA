import java.util.*;

public class ValidParentheses {

    // Leetcode 20
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        if (n % 2 != 0) return false;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("({})[]"));
    }
}