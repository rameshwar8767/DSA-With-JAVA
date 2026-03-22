import java.util.*;

public class PositionOfElementInInfiniteNum {

    public static int positionOfElement(int[] nums, int target){
        int start = 0;
        int end = 1;

        while(target > nums[end]){
            int newStart = end + 1;
            end = end * 2;   // double the range
            start = newStart;
        }

        // Step 2: Binary Search
        return binarySearch(nums, target, start, end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14,16,18,20};
        int target = 14;
        System.out.println(positionOfElement(nums, target));
    }
}