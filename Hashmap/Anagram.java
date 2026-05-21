import java.util.*;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {

        // Length check
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Reduce frequency using s2
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("ram","mar"));
    }
}
