import java.util.*;

public class Heaps<T extends Comparable<T>> {
    
    private ArrayList<T> list;

    public Heaps(){
        list = new ArrayList<>();
    }
    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);

    }

    private int parent(int index){
        return (index-1)/2
    }
}

