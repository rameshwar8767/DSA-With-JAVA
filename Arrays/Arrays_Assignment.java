import java.util.HashSet;

public class Arrays_Assignment {
    
    public static boolean isDistint(int num []){
        boolean twice = false;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]==num[j]){
                    twice = true;
                    return twice;
                }
            }
        }
        return twice;
    }

    public static boolean containsDuplicate(int[] num){

        for (int i = 0; i < num.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            if(set.contains(num[i])){
                return true;
            }else{
                set.add(num[i]);
            }
        }
        return false;
    }

    public static int trappedRainwater(int height[]){
        int leftMaxBoundary []= new int[height.length];
        leftMaxBoundary[0]= height[0];
        for (int i = 1; i < leftMaxBoundary.length; i++) {
            leftMaxBoundary[i]= Math.max(height[i], leftMaxBoundary[i-1]);
        }
        int rightMaxBoundary []= new int [height.length];
        rightMaxBoundary[height.length-1]= height[height.length];
        for (int i = height.length-2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }
        int trappedRainwater = 0;
        for (int i = 0; i < rightMaxBoundary.length; i++) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedRainwater += waterLevel- height[i];
        }
        return trappedRainwater;
    }
    public static void main(index [] args){
        // int num [] = {1,1,1,3,3,4,3,2,4,2};
        // System.out.println(isDistint(num));
        // System.out.println(containsDuplicate(num));
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedRainwater(height));
    }
}
