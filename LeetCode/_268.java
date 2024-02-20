import java.util.Arrays;

public class _268 {
    public int missingNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        while (count<nums.length){
            if(nums[count]!=count++) return --count;
        }
        return count;
    }
}
