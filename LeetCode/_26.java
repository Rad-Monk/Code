import java.util.Scanner;

class _26 {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for (int i=1; i<nums.length;i++){
            if (nums[i-1]==nums[i]){
                continue;
            }
            nums[k]=nums[i];
            k++;
        }
        return k;
    }

    public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size: ");
        int s=sc.nextInt();
        int[] nums= new int[s];
        for(int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(nums));
    }
}