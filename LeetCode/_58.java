public class _58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int size = 0;
        for(int i = s.length()-1; i>=0;i--){
            if(s.charAt(i) == ' ') break;
            size++;
        }
        return size;
    }
}
