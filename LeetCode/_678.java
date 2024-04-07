import java.util.Stack;

public class _678 {
    public static boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') stack.push(i);
            else if(s.charAt(i) == '*') star.push(i);
            else {
                if(!stack.isEmpty()) stack.pop();
                else if(star.size()!=0) star.pop();
                else {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                if(stack.pop() > star.pop()) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
    }
}

