import java.util.*;

public class skipACharacter {
    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(skipCharacter(s, 'a', 0));
    }

    private static String skipCharacter(String s, char ch, int idx) {
        int n = s.length();
        if (idx == n) {
            return "";
        }

        char currentChar = s.charAt(idx);
        if (currentChar == ch) {
            return skipCharacter(s, ch, idx + 1); // Skip the character
        } else {
            return currentChar + skipCharacter(s, ch, idx + 1); // Include the character
        }
    }
}
