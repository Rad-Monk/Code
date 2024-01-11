import java.util.*;
public class _169 {
    public int majorityElement(int[] nums) {

        int major= nums.length / 2;
        int elem=0;
        HashMap<Integer, Integer> frequency= new HashMap<>();
        for (int num : nums) {
            if (frequency.containsKey(num)) {
                frequency.replace(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
            if (frequency.get(num) > major) {
                elem = num;
            }
        }
        return elem;
    }
}
