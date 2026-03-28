import java.util.*;
public class TurnOnKthBit {
    public static int setKthBit(int n, int k) {
        int num = 1;
        num = num << k;
        
        return n | num;
    }
    public static void main(String[] args) {
        System.out.println(setKthBit(10,2));
    }
}
