import java.util.*;

public class ArraySubset {
    public static boolean isSubset(int a[], int b[]) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int ele : a){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        
        for(int ele : b){
            if(!map.containsKey(ele) || map.get(ele) == 0) return false;
            
                
            map.put(ele,map.get(ele)-1);
    
            
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a, b));
    }
}
