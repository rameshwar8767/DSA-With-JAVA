import java.util.*;

public class STL{
    public static void main(String[] args) {
        // hashset contains unique element
        // HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(24);
        set.add(11);
        set.add(10);
        set.add(5);

        System.out.println(set.size());
        System.out.println(set.contains(24));
        set.remove(24);
        System.out.println(set.size());
        System.out.println(set.contains(24));
        System.out.println(set);
    }
}