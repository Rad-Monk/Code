import java.util.HashMap;

public class _287 {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if( map.containsKey(nums[i])) return nums[i];
            map.put(nums[i],1);
        }
        return 0;
    }
}
