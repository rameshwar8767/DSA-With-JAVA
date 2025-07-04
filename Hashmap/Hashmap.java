import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();

        //Insert
        map.put("samosa",25);
        map.put("tea",12);
        map.put("pohe",25);

        System.out.println(map);

        //Get
        System.out.println(map.get("pohe"));
        System.out.println(map.get("Vadapva"));

        System.out.println(map.containsKey("pohe"));
        System.out.println(map.containsKey("coffe"));

        // map.remove("pohe");
        System.out.println(map);

        // Size
        System.out.println(map.size());

        // Is Empty
        // map.clear();
        System.out.println(map.isEmpty());

        // Iterate
        Set <String> keys =map.keySet();
        System.out.println(keys);
        for (String item : keys) {
            System.out.println(item +" "+ map.get(item));
        }

    }
}
