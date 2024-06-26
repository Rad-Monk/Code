import java.util.Arrays;
import java.util.HashMap;

public class _4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged;
        merged= new int[nums1.length + nums2.length];
        int j = 0;
        for (int i : nums1) {
            merged[j] = i;
            j++;
        }
        for (int i : nums2) {
            merged[j] = i;
            j++;
        }
        Arrays.sort(merged);
        int len = merged.length;
        if ( len%2 == 0) {
            return ((float)merged[len/2-1] + (float)merged[len/2])/2;

        }
        else return (double)merged[len/2];
    }
}
