import java.util.Scanner;

class _1 {
    public int[] twoSum(int[] nums, int target) {
        int[] output= new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if( (i+j) == target){
                    output[0]=i;
                    output[1]=j;
                    break;
                }
            }
        }
        return output;
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of values");
        int x= sc.nextInt();
        int []nums= new int[x];
        for(int i=0;i<x;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target= sc.nextInt();
        System.out.println("the given indexes are: ");
        System.out.println(twoSum(nums,target));
    }
}