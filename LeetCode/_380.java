import java.util.*;
public class _380 {
    public class RandomizedSet() {
        public ArrayList<Integer> list = new ArrayList<>();
        public Map<Integer, Integer> map = new HashMap<>();


    public boolean has(int val){
        return map.containsKey(val);
    }


    public boolean insert(int val) {
        if(has(val)) return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    public boolean remove(int val) {
        if (!has(val)) return false;
        int index=map.get(val);
        list.set(index, list.get(list.size()-1));
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }

    public int getRandom() {
        Random r= new Random();
        return list.get(r.nextInt(list.size()));
    }
}}
