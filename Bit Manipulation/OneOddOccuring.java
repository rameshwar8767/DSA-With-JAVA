import java.util.*;

public class OneOddOccuring {
    // GFG

    public static int getOddOccurrence(int[] arr) {
        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 4, 4, 5, 5};

        int result = getOddOccurrence(arr);

        System.out.println("Odd occurring element: " + result);
    }
}