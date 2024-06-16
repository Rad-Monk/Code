import java.util.Arrays;
import java.util.Stack;

public class _84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, n);
        int i=0, res=0;
        while(i<n){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) left[i] = stack.peek();
            stack.add(i);
            i++;

        }
        stack.clear();
        i = n-1;
        while(i>=0){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) right[i] = stack.peek();
            stack.add(i);
            res= Math.max(res,heights[i] * (right[i] - left[i] - 1));
            i--;
        }
        return res;
    }
}
