import java.util.*;

public class ShortestPath { // Renamed class from 'String' to 'ShortestPath'
    // public static float getShortestPath(String path) {
    //     int x = 0, y = 0;
    //     for (int index = 0; index < path.length(); index++) {
    //         char dir = path.charAt(index);
    //         // North
    //         if (dir == 'N') {
    //             y++;
    //         }
    //         // South
    //         else if (dir == 'S') {
    //             y--;
    //         }
    //         // East
    //         else if (dir == 'E') {
    //             x++;
    //         }
    //         // West
    //         else if (dir == 'W') {
    //             x--;
    //         }
    //     }
    //     int x2 = x * x;
    //     int y2 = y * y;
    //     return (float) Math.sqrt(x2 + y2);
    // }
    public static String upperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    
    }

    public static void main(String[] args) {
        // String path = "WNEENESENNN"; // No longer causes an error
        // System.out.println(getShortestPath(path));
        // String str = "hi, i am rameshwar ";
        // System.out.println(upperCase(str));
        String str = "aaabbcdddd";
        System.out.println(compress(str));
    }
}
