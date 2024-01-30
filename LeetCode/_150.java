import java.util.Stack;

public class _150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String token: tokens){
            if( token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*") ){
                int operation;
                int n1= stack.pop();
                int n2= stack.pop();
                operation = switch (token) {
                    case "+" -> n1 + n2;
                    case "-" -> n1 - n2;
                    case "*" -> n1 * n2;
                    default -> (n1 / n2);
                };
                stack.push(operation);
                continue;
            }
            stack.push(Integer.parseInt(token));

        }
        return stack.pop();
    }
    public static void main(String[] args){
        String[] s= new String[]{"3","-4","+"};
        _150 obj= new _150();
        System.out.println(obj.evalRPN(s));
    }
}
