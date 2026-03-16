public class Basics {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;   // element found
            }
            else if (arr[mid] < target) {
                start = mid + 1;  // search right half
            }
            else {
                end = mid - 1;    // search left half
            }
        }

        return -1; // element not found
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 9, 12, 15, 18};
        int target = 9;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}