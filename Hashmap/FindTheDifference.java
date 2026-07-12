import java.util.*;

public class FindTheDifference {

    // Leetcode 389
    public static char findTheDifference(String s, String t) {
        if(s.length() == 0) return t.charAt(0);
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch,map.get(ch)-1);
            }
            if(map.containsKey(ch) && map.get(ch) == 0){
                map.remove(ch);
            }
        }
        char ans = '\0';   // default null character

        for (char ch : map.keySet()) {
            ans = ch;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.next();

        System.out.print("Enter string t: ");
        String t = sc.next();

        char result = findTheDifference(s, t);

        System.out.println("Extra character: " + result);

        sc.close();
    }
}