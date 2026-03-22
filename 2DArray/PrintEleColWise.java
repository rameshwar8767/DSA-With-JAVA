import java.util.*;

public class PrintEleColWise {

    public static void printColWise(int[][] matrix){
        for(int i = 0; i < matrix[0].length; i++ ){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[j][i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4,5},
            {6,2,-1,-5,3},
            {3,2,1,0,4},
            {-2,1,3,-4,5}
        };
        printColWise(matrix);
    }
}
