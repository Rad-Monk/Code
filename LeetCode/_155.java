import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class _155 {
    public List<int[]> stack;
    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        if(stack.size() == 0){
            stack.add(0, new int[]{val,val});
            return;
        }
        int min = getMin();
        stack.add(new int[]{val, Math.min(val,min)});
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1)[0];
    }
    public int getMin() {
        return stack.get(stack.size() - 1)[1];
    }
}
