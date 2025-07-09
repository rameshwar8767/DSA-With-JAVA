import java.util.*;

public class nqueesns {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';
            }
        }

        nqueens(board,0);

    }

    private static boolean isSafe(char[][] board, int row, int col){
        // check row 
        int n = board.length;
        for(int j = 0; j<n; j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        // check col
        for(int i = 0; i<n; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int i = row;
        int j = col;

        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        i = row;
        j = col;

        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        

        
        return true;

        
    }

    private static void nqueens(char[][] board, int row){
        int n = board.length;
        if(row == n){
            for( char[] b : board){
                System.out.println(new String(b));
            }
            System.out.println();
            return;
        }
        for(int j = 0; j < n; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = 'X'; // backtracking
            }

        }
    }

    
}
