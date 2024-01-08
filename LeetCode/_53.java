public class _53 {
//    public int[] maxSub(int[] nums, int start, int end, int sum){
//        int[] sub= new int[2];
//        if (start>end){
//            sub[0]=start;
//            sub[1]=end;
//            return sub;
//        }
//        if ((sum - nums[start]) > (sum - nums[end])){
//
//        }
//    }
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // Initialize with the smallest possible integer value
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
