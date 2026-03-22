import java.util.*;

public class MinEleOutOfMaxEleOfEachRow {

    public static int findMinEleOutOfMaxEleOfEachRow(int[][] matrix){
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < matrix.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < matrix[0].length; j++){
                int curr = matrix[i][j];
                max = Math.max(max, curr);
            }
            ans = Math.min(ans, max);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4,5},
            {6,2,-1,-5,3},
            {3,2,1,0,4},
            {-2,1,3,-4,5}
        };
        System.out.println(findMinEleOutOfMaxEleOfEachRow(matrix));
    }
}
