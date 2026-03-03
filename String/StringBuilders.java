import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ram");
        System.out.println(sb);
        // sb.append("hdhhdhh");
        System.out.println(sb);
        System.out.println(sb.length() + " "+ sb.capacity());
    }
}
