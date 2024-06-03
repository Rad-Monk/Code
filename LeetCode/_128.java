import java.util.Arrays;

public class _128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1; int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length-1;i++){
            int elem = nums[i];
            if (elem+1 == nums[i+1]){
                count++;
            }
            else{
                if(elem == nums[i+1]) continue;
                if(count > max){
                    max = count;
                }
                count = 1;
            }
        }
        if(count>max) max= count;
        return max;
    }

    public static void main(String[] args) {
        _128 obj = new _128();
        int[] nums = new int[]{0,1,1,2};
        System.out.println(obj.longestConsecutive(nums));
    }
}
