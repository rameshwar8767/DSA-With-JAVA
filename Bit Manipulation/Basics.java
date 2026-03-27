import java.util.*;

public class Basics {

    public static void main(String[] args) {
        System.out.println(51 & 42);
        System.out.println(51 | 42);

        // 1's complement
        int x = 5;
        System.out.println(~x);
        System.out.println(-x-1);
        
        //2's complement
        System.out.println(-x);
        System.out.println(~x + 1);
    }
}