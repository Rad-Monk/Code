public class _165 {
    public int[] twoSum(int[] numbers, int target) {
        int[] output= new int[2];
        int i=0;
        int l= numbers.length - 1;
        while (i < l){
            if ((numbers[i] + numbers[l]) == target){
                output[0]= i + 1;
                output[1]= l + 1;
                break;
            } else if ((numbers[i] + numbers[l]) > target) {
                l--;
            }
            else {
                i++;
            }
        }
        return output;
    }
}
