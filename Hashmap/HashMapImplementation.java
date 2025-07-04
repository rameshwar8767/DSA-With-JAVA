import java.util.*;
public class HashMapImplementation {

    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final flaot DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V val;
            Node(K key, V val){
                this.key = key;
                this.val = val;
            }
        }
        private int n; // the number of entries in map
        private LinkedList<Node>[] buckets;

        public void initBuckets(int N){ // N- capacity/ size of buckets array
            buckets = new LinkedList[N];
            for(int i = 0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }
        //Traverses the ll and looks for a node with key , if found return indes, otherwise return null
        private int searchInBucket(LinkedList<Node> bucket,K key){
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size(){

        }

        public void put(K key, V val){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket  =  buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){ // key doesn't exist, we have to insert a new Node
                Node node = new Node(key, val);
                currBucket.add(node);
                n++;
            }else{ // update case
                Node currNode = currBucket.get(ei);
                currNode.val = val;
            }
        }
        

        public V get(K key){

        }

        public V remove(K key){

        }
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();

    }
}
