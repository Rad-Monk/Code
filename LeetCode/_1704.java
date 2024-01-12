public class _1704 {
    public boolean halvesAreAlike(String s) {
        int l= s.length()-1;
        int c=0;
        s=s.toLowerCase();
        for (int i =0; i<=l/2;i++){
            if (s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'){
                c++;
            }
            if (s.charAt(l-i)=='a' ||s.charAt(l-i)=='e' ||s.charAt(l-i)=='i' ||s.charAt(l-i)=='o' ||s.charAt(l-i)=='u' ){
                c--;
            }
        }
        return c == 0;
    }
}
