package Recursion;

public class Assignment {

    public static void mergeSort(String arr[], int si, int ei) {
        // Base condition
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    private static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Merge the two halves
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) { // Use compareTo for strings
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted temp array back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
