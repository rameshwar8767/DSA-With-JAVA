import java.util.*;

public class OptmiseratInDeadMazeFour {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 1}
        };
        
        print(0, 0, rows - 1, cols - 1, "", maze);
    }

    private static void print(int sr, int sc, int er, int ec, String path, int[][] maze) {
        // Boundary & obstacle & revisit checks
        if (sr < 0 || sc < 0 || sr > er || sc > ec) return;
       

        // Destination reached
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }
         if (maze[sr][sc] == 0) return;
        if(maze[sr][sc] == -1) return;

        // Mark current cell as visited
      
        maze[sr][sc] = -1;

        // Explore all 4 directions
        print(sr, sc + 1, er, ec, path + "R", maze); // right
        print(sr + 1, sc, er, ec, path + "D", maze); // down
        print(sr, sc - 1, er, ec, path + "L", maze); // left
        print(sr - 1, sc, er, ec, path + "U", maze); // up

        // Backtrack
        maze[sr][sc] = 1;
    }

}
