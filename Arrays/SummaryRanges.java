import java.util.*;
import java.util.ArrayList;
import java.util.List;


// Leetcode 228
class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        if(nums.length == 0) return ans;

        int i = 0;

        while(i < nums.length){
            int start = nums[i];

            while(i + 1 < nums.length && nums[i] + 1 == nums[i+1]){
                i++;
            }

            int end = nums[i];

            if(start == end){
                ans.add(String.valueOf(start));
            }

            else{
                ans.add(start + "->" + end);
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        SummaryRanges obj = new SummaryRanges();

        int[] nums = {0, 1, 2, 4, 5, 7};

        List<String> result = obj.summaryRanges(nums);

        System.out.println("Summary Ranges:");

        for (String s : result) {
            System.out.println(s);
        }
    }
    
}