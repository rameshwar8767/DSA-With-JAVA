import java.util.*;

class NextGreaterElement {

    // GFG 
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;

        ans.add(-1);
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }

            st.push(arr[i]);
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 3, 2, 4};

        ArrayList<Integer> result = sol.nextLargerElement(arr);

        System.out.println("Next Greater Elements:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}