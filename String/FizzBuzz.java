import java.util.*;

public class FizzBuzz {
    // Leetcode 412

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            int curr = i;
            if(i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }else if(i % 3==0){
                ans.add("Fizz");
            }else if(i % 5 == 0){
                ans.add("Buzz");
            }else{
                String s = Integer.toString(i);
                ans.add(s);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        List<String> result = fizzBuzz(n);

        System.out.println("FizzBuzz Output:");

        for(String str : result){
            System.out.print(str + " ");
        }

        sc.close();
    }
}
