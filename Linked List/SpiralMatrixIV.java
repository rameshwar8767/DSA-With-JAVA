import java.util.*;

class ListNode {
    int val; 
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class SpiralMatrixIV {
    
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];

        for(int i = 0; i < m; i++) {
            Arrays.fill(ans[i], -1);
        }

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        ListNode temp = head;

        while(temp != null && top <= bottom && left <= right){
            
            // Left → Right
            for(int i = left; i <= right && temp != null; i++){
                ans[top][i] = temp.val;
                temp = temp.next;
            }
            top++;

            // Top → Bottom
            for(int i = top; i <= bottom && temp != null; i++){
                ans[i][right] = temp.val;
                temp = temp.next;
            }
            right--;

            // Right → Left
            for(int i = right; i >= left && temp != null; i--){
                ans[bottom][i] = temp.val;
                temp = temp.next;
            }
            bottom--;

            // Bottom → Top
            for(int i = bottom; i >= top && temp != null; i--){
                ans[i][left] = temp.val;
                temp = temp.next;
            }
            left++;
        }

        return ans;
    }

    // Helper function to print matrix
    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 3, n = 5;

        // Create linked list: 1 → 2 → 3 → ... → 10
        ListNode head = new ListNode(1);
        ListNode curr = head;

        for(int i = 2; i <= 10; i++){
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        int[][] result = spiralMatrix(m, n, head);

        printMatrix(result);
    }
}