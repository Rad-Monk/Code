import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class _1700 {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = sandwiches.length-1; i>=0;i--){
            stack.push(sandwiches[i]);
        }
        for(int i: students){
            queue.add(i);
        }
        int i = queue.size();
        while(i!=0){
            i--;
            if(Objects.equals(queue.peek(), stack.peek())) {
                queue.poll();
                stack.pop();
                i = queue.size();
            }
            else{
                queue.add(queue.poll());
            }
        }
        return queue.size();
    }

    public static void main(String[] args) {
        int[] students = new int[]{1,1,0,0};
        int[] sandwiches = new int[]{0,1,0,1};
        System.out.println(countStudents(students,sandwiches));
    }
}
