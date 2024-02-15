import java.util.Arrays;

public class _2971 {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        long ans = -1;

        for (int num : nums) {
            if (num < sum) {
                ans = num + sum;
            }
            sum += num;
        }

        return ans;
    }
    public static void main(String[] args){
        _2971 obj= new _2971();
        int[] nums= new int[]{1,12,1,2,5,50,3};
        System.out.println(obj.largestPerimeter(nums));
    }
}
