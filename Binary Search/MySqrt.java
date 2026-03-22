public class MySqrt {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            long sq = (long) mid * mid; 
            if(sq <= x){
                ans = mid;
                start = mid + 1;
            }else end = mid -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }
}
