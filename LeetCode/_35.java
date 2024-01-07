
public class _35 {
    public int binary_search(int[] nums, int target, int start_point, int end_point){
        int a= (end_point+start_point)/2;
        if (end_point<start_point){
            return start_point;
        }
        if(target==nums[a]){
            return a;
        }
        else if (target<nums[a]){
            return binary_search(nums,target,start_point,a-1);
        }
        else{
            return binary_search(nums, target, a+1, end_point);
        }
    }
    public int searchInsert(int[] nums, int target) {
        return binary_search(nums,target,0,nums.length-1);
    }
}
