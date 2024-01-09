import java.util.List;
import java.util.ArrayList;
public class _119 {
    public List<Integer> pascalRow(int nums, List<List<Integer>> outer){
        List<Integer> inner= new ArrayList<>();
        for(int i =0;i<nums;i++){
            inner.add(0);
        }
        inner.set(0,1);
        inner.set(nums-1,1);
        for(int i=1;i<nums-1;i++){
            int first=outer.get(nums-2).get(i-1);
            int last= outer.get(nums-2).get(i);
            inner.set(i,(first+last));
        }
        return inner;
    }
    public List<Integer> getRow(int rowIndex) {
        int numRows= rowIndex+1;
        List<List<Integer>>  outer= new ArrayList<>();
        for (int i = 1;i <= numRows; i++){
            List<Integer> inner= new ArrayList<>();
            if(i==1){
                inner.add(1);
            }
            else {
                inner=pascalRow(i,outer);
            }
            outer.add(inner);
        }
        return outer.get(rowIndex);
    }
}
