import java.util.*;
public class _189 {
    public static int[] rotating(int[] nums, int k){
        Deque<Integer> num= new LinkedList<>();
        for(int i =0 ; i< nums.length; i++){
            num.addLast(nums[i]);
        }
        for(int i =0; i< k; i++){
            num.offerFirst(num.pollLast());
        }
        for(int i =nums.length-1; i>=0; i--){
            nums[i]= num.pollLast();
        }
        return nums;
    }
    public static void rotate(int[] nums, int k) {
        if (k< nums.length) nums=rotating(nums, k);
        else if ((nums.length % k)== 0) return;
        else {
            if( nums.length > k){
                k = nums.length % k;
                nums=rotating(nums,k);
            }
            else{
                k = k % nums.length;
//                System.out.println("value of k when k is greater: "+ k);
                nums=rotating(nums,k);
            }
        }
    }
    public static void main(String[] args){
        int[] nums= {1,2};
        int k =3;
        rotate(nums,k);
    }
}
