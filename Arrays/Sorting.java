public class Sorting {
    public static void bubbleSort(int arr[]){
    
        for (int i = 0; i <arr.length-1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
                
            }
           
        }
        
    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos]> arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol-1; j >= startCol; j--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow-1; i > startRow; i--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static boolean staircaseSearch(int arr[][], int key){
        int row = 0;
        int col = arr[0].length-1;
        while (row < arr.length && col>= 0) {
            if(arr[row][col]==key){
                return true;
            }
            else if(arr[row][col]>key){
                col--;
            }else{
                row++;
            }
        }  
        return false; 
    }

    public static void main(index[] args) {
        // int arr[] = {5,4,1,3,2};
        // insertionSort(arr);
        // printArray(arr);

        int matrix [][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
    
    //    printSpiral(matrix);

        int arr [][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
            
        } ;
        int key = 50;
        System.out.println(staircaseSearch(arr,key));
    }
}
