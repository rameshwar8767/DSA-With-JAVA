import java.util.Arrays;

class MyHashMap {

    private int[] map;

    // Constructor
    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map, -1);
    }

    // Insert or Update
    public void put(int key, int value) {
        map[key] = value;
    }

    // Get value
    public int get(int key) {
        return map[key];
    }

    // Remove key
    public void remove(int key) {
        map[key] = -1;
    }
}

public class DesignHashMap {

    // Leetcode 706

    public static void main(String[] args) {

        MyHashMap hashMap = new MyHashMap();

        // Insert key-value pairs
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);

        // Get values
        System.out.println("Value of key 1: " + hashMap.get(1));
        System.out.println("Value of key 2: " + hashMap.get(2));
        System.out.println("Value of key 4: " + hashMap.get(4));

        // Update value
        hashMap.put(2, 50);
        System.out.println("Updated value of key 2: " + hashMap.get(2));

        // Remove a key
        hashMap.remove(2);
        System.out.println("After removing key 2: " + hashMap.get(2));

        // Insert another key
        hashMap.put(100, 999);
        System.out.println("Value of key 100: " + hashMap.get(100));
    }
}