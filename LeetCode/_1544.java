public class _1544 {
    public static String makeGood(String s) {
        StringBuilder st = new StringBuilder(s);
        if(st.length()<1) return s;
        int i = 0;
        while(i < st.length()-1 && st.length()>=1){
            if((st.charAt(i)-65 == st.charAt(i+1)-97) || (st.charAt(i)-97 == st.charAt(i+1)-65)){
                st.delete(i,i+2);
                i = 0;
            }
            else i++;
        }
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }
}
