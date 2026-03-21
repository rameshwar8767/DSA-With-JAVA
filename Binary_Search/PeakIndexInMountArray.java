import java.util.*;

public class PeakIndexInMountArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                // ascending part → go right
                start = mid + 1;
            } else {
                // descending part → mid could be peak
                end = mid;
            }
        }
        return start; // or end (both same)
    }    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
