import java.util.*;

public class ratInDeadMazeFour {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 1, 1, 1},
            {0, 0, 1, 0}
        };
        boolean[][] isVisited = new boolean[rows][cols];
        print(0, 0, rows - 1, cols - 1, "", maze, isVisited);
    }

    private static void print(int sr, int sc, int er, int ec, String path, int[][] maze, boolean[][] isVisited) {
        // Boundary & obstacle & revisit checks
        if (sr < 0 || sc < 0 || sr > er || sc > ec) return;
        if (maze[sr][sc] == 0 || isVisited[sr][sc]) return;

        // Destination reached
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }

        // Mark current cell as visited
      
        isVisited[sr][sc] = true;

        // Explore all 4 directions
        print(sr, sc + 1, er, ec, path + "R", maze, isVisited); // right
        print(sr + 1, sc, er, ec, path + "D", maze, isVisited); // down
        print(sr, sc - 1, er, ec, path + "L", maze, isVisited); // left
        print(sr - 1, sc, er, ec, path + "U", maze, isVisited); // up

        // Backtrack
        isVisited[sr][sc] = false;
    }
}
