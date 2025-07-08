import java.util.*;

public class triangle {
    public static void main(String[] args) {
        triangle(4, 0);
        System.out.println();
        triangle2(4, 0);
    }
    static void triangle(int row,int col){
        if(row == 0) return;
        if(col < row) { 
            System.out.print("*");
            triangle(row, col+1);
        }else{
            System.out.println(); 
            triangle(row-1, 0);
        }
    }

    static void triangle2(int row,int col){
        if(row == 0) return;
        if(col < row) {
            triangle2(row, col+1);
            System.out.print("*");
            
        }else{
            triangle2(row-1, 0);
            System.out.println();
            
        }
    }
}
