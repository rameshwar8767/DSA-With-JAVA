import java.util.*;

public class MissingRange {

    public static ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        
        int start = low;
        int end = high;
        
        while(start <= end){
            if(set.contains(start)) start++;
            else{
                ans.add(start);
                start++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,12,11,15};
        int low = 10;
        int high = 15;
        System.out.println(missingRange(arr, low, high));
    }
}
