import java.util.*;
public class p1 {
    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for (String str : strs) {
            sb.append(str);
            sb.append("!%(@)");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        int  i=0;
        while(i!=len){
            if(str.startsWith("!%(@)",i)){
                list.add(sb.toString());
                sb.delete(0,sb.length());
                i+=8;
                continue;
            }
            sb.append(str.charAt(i));
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        p1 obj = new p1();
        List<String> str = new ArrayList<>();
        str.add("neet");
        str.add("code");
        str.add("love");
        str.add("you");
        System.out.println("original message: ");
        for (String s : str) {
            System.out.print(s+" ");
        }
        System.out.println();
        String s= obj.encode(str);
        System.out.println("encoded message: "+s);
        List<String> decode;
        decode = obj.decode(s);
        System.out.println("decoded message: ");
        for (String s1 : decode) {
            System.out.print(s1+" ");
        }
    }
}
