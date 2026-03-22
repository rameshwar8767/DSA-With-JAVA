public class MaximumCount {
        public static int maximumCount(int[] nums) {
        return Math.max(negCount(nums),posCount(nums));
    }

    private static int negCount(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < 0){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans + 1;
    }
    private static int posCount(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > 0){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid+1;
            }
            
        }
        return nums.length - ans;
    }
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,3,4,7,9};
        System.out.println(maximumCount(nums));
    }
}
