import java.util.*;

public class RemoveAllAdjacentDuplicatesInString {
    // Leetcode 1047
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
