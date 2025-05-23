import java.util.Stack;

public class StackA {
    //Max Area In Histogram
    public static int maxArea(int height[]){
        int maxArea = 0;
        int nsr[]= new int [height.length];
        int nsl[]= new int [height.length];

        Stack<Integer> s = new Stack<>();
        for(int i = height.length-1; i>=0; i-- ){
            while ((!s.isEmpty() && height[s.peek()]>=height[i])) {
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]= height.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();
        for(int i = 0; i<height.length; i++ ){
            while (!s.isEmpty() && height[s.peek()]>=height[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //current area  
        for(int i =0; i<height.length; i++){
            int h = height[i];
            int w = nsr[i]-nsl[i] -1;
            int currArea = h * w;
            maxArea= Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void stocksSpan(int stocks[], int [] span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i = 1; i < stocks.length; i++){
            int currPrice = stocks[i];
            while ((!s.isEmpty() && currPrice > stocks[s.peek()])) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }

            s.push(i);
        }
    }
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i< str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch =='{' ||ch == '['){
                s.push(ch);
            }else{
                //closing
                
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '('&& ch==')') || (s.peek() == '{'&& ch=='}') || (s.peek() == '['&& ch==']')){
                    s.pop();
                    
                }else{
                    return false;
                }
            }
            
        }
        if (s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i< str.length(); i++){
            char ch = str.charAt(i);
            //opening
            //closing
            if(ch == ')'){
                int count = 0;
                while (!s.isEmpty()&& s.peek()!= '(') {
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }

            }else{
                s.push(ch);
            }
        
            
        }
        return false;
        
    }
    

    public static void main(String[] args) {
        // int stocks [] ={100,80,60,70,60,85,100};
        // int span [] = new int[stocks.length];
        // stocksSpan(stocks, span);
        // for (int i = 0; i < span.length; i++) {
        //     System.out.println(span[i]+" ");
        // }
        // int arr[] = {6,8,0,1,3};
        // Stack<Integer> s = new Stack<>();
        // int nextGreater[] = new int[arr.length];
        
        // for(int i = arr.length-1; i>=0; i--){
        //     while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        //         s.pop();
        //     }
        //     if(s.isEmpty()){
        //         nextGreater[i] = -1;
        //     }else{
        //         nextGreater[i] = arr[s.peek()];
        //     }
        //     s.push(i);
        // }
        // for (int i = 0; i < nextGreater.length; i++) {
        //     System.out.println(nextGreater[i]+"");
        // }
        // String str = "((a+b)+(c+d))";
        // System.out.println(isDuplicate(str));
        int height[] ={2,1,5,6,2,3};
        System.out.println(maxArea(height));
    }
}
