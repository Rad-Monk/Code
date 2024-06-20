import java.util.*;
public class _875 {
    public int find_k(int[]piles, int min, int max, int h){
        int left = 0;
        int k= Integer.MAX_VALUE;
        int right = max;
        while(left <= right){

            int mid = left + ( right - left )/2;
            long time = 0;
            for (int pile : piles) {
                time += (int) Math.ceil(pile / (double) mid);
            }
            if(time == h){
                if(mid < k) k = mid;
                right = mid - 1;
            }
            if(time > h){
                left = mid + 1;
            }
            if(time < h){
                if (mid < k) k = mid;
                right = mid - 1;
            }
        }
        return k;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        return find_k(piles, 0, piles[piles.length-1], h);
    }

    public static void main(String[] args) {
        _875 obj = new _875();
        int[] piles = new int[]{1000000000};
        System.out.println(obj.minEatingSpeed(piles, 2));
    }
}
