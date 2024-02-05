import java.util.LinkedHashMap;
import java.util.Map;

public class _387 {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map= new LinkedHashMap<>();
        for( int i=0; i< s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else map.put(s.charAt(i),1);
        }
        for (Map.Entry<Character,Integer> elem: map.entrySet()){
            if( elem.getValue()==1){
                for( int i=0; i< s.length(); i++){
                    if( s.charAt(i)== elem.getKey()){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main( String[] args){
        String s= "dddccdbba";
        _387 obj= new _387();
        System.out.println(obj.firstUniqChar(s));
    }
}
