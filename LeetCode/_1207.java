import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class _1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> map= new HashMap<>();
        int len= arr.length-1;
        for(int i=0; i<=len;i++){
            if (map.containsKey(arr[i])){
                map.replace(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int[] values= new int[map.size()];
        int i =0;
        for(int value: map.values()){
            values[i]= value;
            i++;
        }
        Arrays.sort(values);
        i--;
        while (i>0){
            if(values[i]==values[i-1]){
                return false;
            }
            i--;
        }
        return true;
    }

    public static void main(String[] args){
        _1207 obj= new _1207();
        int[] arr= {1,1,2,2,2,2,2,3,4,4,4};
        System.out.println(obj.uniqueOccurrences(arr));
    }
}
