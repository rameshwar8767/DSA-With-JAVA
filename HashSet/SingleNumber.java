import java.util.*;

public class SingleNumber{

    // Leetcode 136

    public static int singleNumber(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        int ans = 0;
        for(int num : set){
            ans = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(nums));

    }
}