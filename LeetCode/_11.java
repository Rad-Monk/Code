public class _11 {
    public int maxArea(int[] height) {
        int max= 0;
        int current =0;
        int i = 0;
        int j = height.length - 1;
        while(i <= j){
            current = Math.min(height[i], height[j]) * (j-i);
            if(height[i] < height[j]) i++;
            else j--;
            if(current>max) max = current;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        _11 obj = new _11();
        System.out.println(obj.maxArea(height));
    }
}
