import java.util.HashSet;

public class Sets_STL {
    public static void main(String[] args) {
         // hashset contains unique element
        HashSet<Integer> set = new HashSet<>();

        set.add(12);
        set.add(36);
        set.add(11);
        set.add(24);
        set.add(11);

        System.out.println(set.size());
        System.out.println(set.contains(24));
        // set.remove(11);
        System.out.println(set.size());
        System.out.println(set);
    }
}
