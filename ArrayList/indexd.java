package ArrayList;
import java.util.*;

public class indexd {

    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        
        mainList.add(list3);
        System.out.println(mainList);
        
        // list.add(1);
        // list.add(9);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // int idx1 = 1;
        // int idx2 = 3;
        // Collections.sort(list, Collections.reverseOrder()); //descending order
        // System.out.println(list);
        // Collections.sort(list); //ascending order
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);
        // list.set(0,7);
        // list.add(1,9);
        // list.remove(2);
        // System.out.println(list.contains(8));
        // System.out.println(list.get(2));
        // System.out.println(list.size());
        // System.out.println(list);
        
        //print an ArrayList
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i)+" ");
        // }
    }
}
