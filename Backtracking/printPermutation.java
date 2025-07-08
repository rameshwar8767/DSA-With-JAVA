import java.util.*;

public class printPermutation {
    public static List<String> printPath(String str, String s,List<String> list){
        if(str.equals("")){
            // System.out.println(s);
            list.add(s);
            return list;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String rem = left+right;
            printPath(rem, s+ch,list);
        }
        return list;
    }
    public static void main(String[] args) {
        String str = "abc";
        List<String> list =new ArrayList<>();
        System.out.println(printPath(str, "", list));
    }

}
