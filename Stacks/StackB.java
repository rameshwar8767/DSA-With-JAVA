package Stacks;
import java.util.*;

public class StackB {

    //push at the bottom of stack
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //Reverse a String using Stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");

        while ((!s.isEmpty())) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    
    // static class Stack {
    //     //Stack using LinkedList

    //     static Node head = null;

    //     public static boolean isEmpty(){
    //         return  head == null;
    //     }

    //     //push
    //     public static void push(int data){
    //         Node newNode = new Node(data);            
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     //pop
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     //peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }




        // //Stack using ArrayList
        // static ArrayList<Integer> list = new ArrayList<>();
        // public static boolean isEmpty(){
        //     return list.size() == 0;
        // }

        // //push
        // public static void push(int data){
        //     list.add(data);
        // }

        // //pop
        // public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return top;
        // }

        // //peek
        // public static int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1);
        //     return top;
        // }
   

    public static void main(String[] args) {
        // Stack s = new Stack();
        //using java Collection Framework
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 5);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
            
        // }
        String str = "abcd";
        System.out.println(reverseString(str));
    }
}
