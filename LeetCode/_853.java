import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class _853 {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] pair = new double[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0]= position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, Comparator.comparingDouble(a -> a[0]));

        Stack<Double> stack = new Stack<>();

        for(int i = n-1; i>=0; i--){
            double time = (target - pair[i][0])/ pair[i][1];
            if(!stack.isEmpty() && stack.peek()> time){
                continue;
            }
            stack.push(time);
        }
        return stack.size();
    }
}
