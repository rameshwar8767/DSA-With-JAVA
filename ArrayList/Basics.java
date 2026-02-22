import java.util.*;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(45);

        // System.out.println(list.get(2));
        list.set(0, 19);
        // System.out.println(list.get(0));
        // System.out.println(list);

        int n = list.size();

        // for (int i = 0; i < n; i++) {
        //     System.out.print(list.get(i)+" ");
        // }
        // list.addFirst(6);
        // System.out.println(list);
        // list.add(2,20);
        // System.out.println(list);
        // list.addLast(90);
        // System.out.println(list);
        // list.removeLast();
        // System.out.println(list);
        // Collections.reverse(list);
        // System.out.println(list);
        System.out.println(list);
        int i = 0;
        int j = list.size()-1;
        while(i<j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        System.out.println(list);
    }
}
