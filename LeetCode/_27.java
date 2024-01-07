import java.util.Scanner;
import java.util.SortedMap;

public class _27 {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for ( int i=1; i<=nums.length;i++){
            if (nums[i-1]!= val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int s= sc.nextInt();
        int nums[]=new int[s];
        for (int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the value to remove");
        int val=sc.nextInt();
        System.out.println(removeElement(nums,val));
    }
}
