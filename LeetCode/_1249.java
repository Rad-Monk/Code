import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1249 {
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder st= new StringBuilder(s);
        List<Integer> rmv= new ArrayList<>();
        for(int i =0 ; i< st.length(); i++){
            if(st.charAt(i)=='('){
                stack.push(i);
            }
            else if((!stack.isEmpty()) && st.charAt(i)==')') stack.pop();
            else if(st.charAt(i)==')') rmv.add(i);
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                st.deleteCharAt(stack.pop());
            }
        }
        while(!rmv.isEmpty())st.deleteCharAt(rmv.remove(rmv.size()-1));
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("))(("));
    }
}
