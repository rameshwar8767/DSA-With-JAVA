import java.util.*;

public class Distinct {
    // GEG
    public static int distinct(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        System.out.println(distinct(arr));
    }
}
