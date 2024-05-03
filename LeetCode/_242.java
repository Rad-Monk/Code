import java.util.Arrays;

public class _242 {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length!=b.length) return false;
        for(int i = 0; i< a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
