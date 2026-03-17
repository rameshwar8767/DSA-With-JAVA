import java.util.*;

public class GetFloor{
    public static int findFloor(int[] arr, int x) {
        int end = arr.length - 1;
        int start = 0;
        int ans = -1;
    
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= x){
                ans = mid;
                start = mid +1;
            }else end = mid -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 4;
        int[] arr= {1,2,3,5,6,8};
        System.out.println(findFloor(arr,x));
    }
}