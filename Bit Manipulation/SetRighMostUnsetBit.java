import java.util.*;

public class SetRighMostUnsetBit {
    public static  int setBit(int n){
        return n | (n + 1);
    }
    public static void main(String[] args) {
        System.out.println(setBit(10));
    }
}
