import java.util.*;

public class InterningNew {
    public static void main(String[] args) {
        String s = "ramu";
        String str = "ramu"; // new string not created ref to already present string
        String s1 = new String("ramu"); //new string created
        String s2 = new String("ramu");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s == str);
        // String is immutable means cannot change indivisual  character
    }
}
