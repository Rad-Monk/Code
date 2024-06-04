public class _125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))) sb.append(Character.toLowerCase(s.charAt(i)));
        }
        for(int i =0; i<sb.length();i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)) return false;
        }
        return true;
    }
}
