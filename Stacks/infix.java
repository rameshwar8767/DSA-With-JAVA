import java.util.*;

public class infix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack <Integer> val = new Stack <>();
        Stack <Character> op = new Stack <>();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            //'0' -> 48 and '9' -> 57
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                     int v2 = val.pop();
                    int v1 = val.pop();
                
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();
                }
                op.pop(); // '(' remove kar diya
            }
            else{
                if(ch == '+' || ch=='-'){
                    //operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();
                    op.push(ch);
                }
                if(ch == '*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        //opertaion
                        int v2 = val.pop();
                        int v1 = val.pop();
                
                        
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);

                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        //val stack size -> 1
        while(val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
