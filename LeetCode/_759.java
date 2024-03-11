package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _791 {
    public String customSortString(String order, String s) {
        StringBuilder st= new StringBuilder();
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0; i< s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0; i<order.length();i++){
            if(map.containsKey(order.charAt(i))){
                int j= map.get(order.charAt(i));
                while(j!=0){
                    j--;
                    st.append(order.charAt(i));
                }
                map.remove(order.charAt(i));
            }
        }
        if(!map.isEmpty()){
            for(Map.Entry<Character,Integer> m: map.entrySet()){
                int j= m.getValue();
                while(j!=0){
                    j--;
                    st.append(m.getKey());
                }
            }
        }
        return st.toString();
    }
    public static void main(String[] args){
        _791 obj= new _791();
        String order= "abcd";
        String s= "cba";
        String o= obj.customSortString(order,s);
        System.out.println(o);
    }
}