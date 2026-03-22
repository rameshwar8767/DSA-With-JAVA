import java.util.*;

public class FindRowWithMaxSum {

    public static int findRowWithMaxSum(int[][] matrix){
        int sum = Integer.MIN_VALUE;
        int maxSumRow = -1;
        for(int i = 0; i < matrix.length; i++){
            int currSum = 0;
            for(int j = 0; j < matrix[0].length; j++){
                currSum += matrix[i][j];
            }
            if(currSum > sum ){
                sum = currSum;
                maxSumRow = i;
            }
        }
        return maxSumRow;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4,5},
            {6,2,-1,-5,3},
            {3,2,1,0,4},
            {-2,1,3,-4,5}
        };
        System.out.print(findRowWithMaxSum(matrix));
    }    
}
