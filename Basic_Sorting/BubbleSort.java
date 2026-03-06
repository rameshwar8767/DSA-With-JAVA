public class BubbleSort {

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {4,5,2,1,4,3,9,5,10};
        int n = arr.length;

        print(arr);

        for(int j = 0; j < n - 1; j++){
            for(int i = 0; i < n - j - 1; i++){

                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }

        System.out.println();
        print(arr);
    }
}