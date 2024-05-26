import java.util.*;

public class _347 {
    class Pair{
        private int[] arr1;
        private int[] arr2;
        public Pair(int[] arr1, int[] arr2){
            this.arr1= arr1;
            this.arr2 = arr2;
        }
        public int[] getArr1(){return arr1;}
        public int[] getArr2(){return arr2;}
    }
    public Pair customSorter(int[] keys, int[] values){
        for(int i =0 ; i< values.length; i++){
            boolean swapped = false;
            for(int j =0; j< values.length-1;j++){
                if(values[j] < values[j + 1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    temp = keys[j];
                    keys[j] = keys[j+1];
                    keys[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return new Pair(keys, values);
    }
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
//            map.put(map.getOrDefault(num, 1), +1);
            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num , 1);
        }
        int[] keys = new int[map.size()];
        int[] values = new int[map.size()];
        int index = 0;
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            keys[index] = m.getKey();
            values[index] = m.getValue();
            index++;
        }
        Pair pair= customSorter(keys,values);
        keys = pair.getArr1();
        for (int i = 0; i < result.length; i++) {
            result[i] = keys[i];
        }
        return result;
    }
    public static void main(String[] args){
        _347 obj = new _347();
        int[] nums = new int[]{1,1,1,2,2,3,3,3,3,3,4,4,4,4,8,8,8};
        int k = 2;
        System.out.println(Arrays.toString(obj.topKFrequent(nums, k)));
    }
}
