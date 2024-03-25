import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if( map.containsKey(nums[i])) {
                list.add(nums[i]);
            }
            map.put(nums[i],1);
        }
        return list;
    }
}
