import java.util.*;

public class PrintMatrixInSnakePattern {

    public static void printMatrixInSnakePattern(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){

            // even row → left to right
            if(i % 2 == 0){
                for(int j = 0; j < matrix[0].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            // odd row → right to left
            else{
                for(int j = matrix[0].length - 1; j >= 0; j--){
                    System.out.print(matrix[i][j] + " ");
                }
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

        // printMatrixInSnakePattern(matrix);
        printMatrixInSnakePattern(matrix);
    }
}