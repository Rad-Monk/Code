import java.util.Stack;

public class _1614 {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int depth=0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i)=='(') stack.push(s.charAt(i));
            if(s.charAt(i)==')') {
                if(depth < stack.size()) depth=stack.size();
                stack.pop();
            }
        }
        return depth;
    }
}
