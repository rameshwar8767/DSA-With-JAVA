import java.util.*;
public class Backtracking {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows,cols);
        System.out.println(count);
        printPath(1,1,rows,cols,"");
    }
    private static int maze(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec ) return 1;
        int totalWays = maze(sr+1,sc, er,ec) + maze(sr,sc+1, er,ec);
        return totalWays;
    }

    private static void printPath(int sr, int sc, int er, int ec, String path){
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec ){
            System.out.println(path);
            return;
        };
        printPath(sr+1,sc, er,ec,path+"D");
        printPath(sr,sc+1, er,ec,path+"R");
        
    }
}
