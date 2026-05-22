import java.util.*;

public class CountNumberOfEqual {
    // GFG
    public static long equalPairs(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);                
            }else{
                map.put(ch,1);
            }
        }
        long pairs = 0;
        
        for(char ch: map.keySet()){
            long freq = map.get(ch);
            pairs += freq*freq;
        }
        
        return pairs;
    }
    public static void main(String[] args) {
        System.out.println(equalPairs("aa"));
    }
}