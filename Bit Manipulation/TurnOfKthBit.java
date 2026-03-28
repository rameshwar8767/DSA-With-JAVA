import java.util.*;
public class TurnOfKthBit {

    public static int turnOfKthBit(int N, int K){
        return (~(1<<K) & N);
    }
    public static void main(String[] args) {
        System.out.println(turnOfKthBit(10, 3));
    }
}
