import java.util.HashMap;

public class _2958 {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (mp.get(nums[r]) > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        _2958 obj =new _2958();
        int[] nums = new int[]{1,2,3,1,2,3,1,2};
        int ret= obj.maxSubarrayLength(nums, 2);
        System.out.println(ret);
    }
}
