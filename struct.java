import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

class dataStruct<T extends Comparable<T>>{
    ArrayList<T> arr;
    HashMap<T, Integer> hashmap;

    public dataStruct() {
        arr = new ArrayList<T>();
        hashmap = new HashMap<T, Integer>();
    }


     void add(T a) {
        if(hashmap.get(a) != null) return;

        int s = arr.size();
        arr.add(a);

        hashmap.put(a, s);
    }

    void remove(T a) {
        Integer index = hashmap.get(a);
        if(index == null) return;

        hashmap.remove(a);

        int s = arr.size();

        T last = arr.get(s -1);

        Collections.swap(arr, index, s-1);

        arr.remove(s-1);

        hashmap.put(last, index);

    }

    T random(){
        Random rand = new Random();
        int index = rand.nextInt(arr.size());

        return arr.get(index);

    }

    Integer search(T a){
        return hashmap.get(a);
    }
}
    


public class struct {

    public static void main (String args[]){
        dataStruct<Integer> ds = new dataStruct<Integer>();

        ds.add(5);
        ds.add(1);
        ds.add(20);
        ds.add(30);
        ds.remove(5);
        System.out.println(ds.random());
        
    }

}