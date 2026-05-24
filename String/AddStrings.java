import java.util.*;

class AddStrings {

    // Leetcode 415
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int digit1 = 0;
            int digit2 = 0;
            if(i >= 0){
                digit1 = num1.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                digit2 = num2.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;
        }

        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String num2 = sc.nextLine();

        String result = addStrings(num1, num2);

        System.out.println("Sum = " + result);

        sc.close();
    }
    
}