import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] ret= new int[nums.length];
        List<Integer> neg= new ArrayList<>();
        List<Integer> pos= new ArrayList<>();
        for (int i: nums){
            if (i<0) neg.add(i);
            else pos.add(i);
        }
        for(int i =nums.length-1; i>=0;i--){
            ret[i]= neg.remove(neg.size()-1);
            ret[--i]= pos.remove(pos.size()-1);

        }
        return ret;
    }
    public static void main(String[] args){
        _2149 obj= new _2149();
        int[] nums= new int[]{3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(obj.rearrangeArray(nums)));
    }
}
