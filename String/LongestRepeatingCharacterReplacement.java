import java.util.*;

public class LongestRepeatingCharacterReplacement {

    // Leetcode 424
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int ans = 0;
        int n = s.length();

        int count[] = new int[26];

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--; // Fix: left, not right
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = characterReplacement(s, k);

        System.out.println("Longest Repeating Character Replacement Length: " + result);

        sc.close();
    }
}