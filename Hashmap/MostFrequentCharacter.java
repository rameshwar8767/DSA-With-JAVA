import java.util.*;

public class MostFrequentCharacter {
    //GFG
    public static char getMaxOccuringChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = 0;
        char ans = 'z';

        // Find answer
        for (char ch : map.keySet()) {
            int count = map.get(ch);

            if (count > max || (count == max && ch < ans)) {
                max = count;
                ans = ch;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        char result = getMaxOccuringChar(s);

        System.out.println("Maximum Occurring Character: " + result);

        sc.close();
    }
}
