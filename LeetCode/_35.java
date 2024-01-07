import java.util.Scanner;

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
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] nums= new int[n];
        for (int i =0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target value");
        int target= sc.nextInt();
        System.out.println(searchInsert(nums,target));
    }
}
