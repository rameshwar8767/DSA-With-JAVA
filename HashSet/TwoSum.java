import java.util.*;

public class TwoSum {

    public static boolean twoSum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int diff = target - ele;
            
            if(set.contains(diff)) return true;
            else{
                set.add(ele);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,8,7};
        System.out.println(twoSum(arr, 10));
    }
}
