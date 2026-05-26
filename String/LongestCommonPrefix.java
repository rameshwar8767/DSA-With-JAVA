import java.util.*;

public class LongestCommonPrefix {

    // Leetcode 14

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            String str = strs[i];
            int j = 0;

            while(j < prefix.length() && j < str.length() 
                    && prefix.charAt(j) == str.charAt(j)){
                j++;
            }

            prefix = prefix.substring(0, j);

            if(prefix.isEmpty()) return "";
        }

        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter strings:");

        for(int i = 0; i < n; i++){
            strs[i] = sc.nextLine();
        }

        String ans = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + ans);

        sc.close();
    }
}