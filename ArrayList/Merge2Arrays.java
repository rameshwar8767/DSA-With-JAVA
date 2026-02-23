public class Merge2Arrays {

    public static int[] merge(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int[] ans = new int[m + n];

        int i = 0; // pointer for ans
        int j = 0; // pointer for num1
        int k = 0; // pointer for num2

        while (j < m && k < n) {
            if (num1[j] <= num2[k]) {
                ans[i++] = num1[j++];
            } else {
                ans[i++] = num2[k++];
            }
        }

        // Copy remaining elements
        while (j < m) {
            ans[i++] = num1[j++];
        }

        while (k < n) {
            ans[i++] = num2[k++];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = {2, 5, 6, 9};
        int[] num2 = {1, 3, 4, 5, 7, 8};

        int[] arr = merge(num1, num2);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}