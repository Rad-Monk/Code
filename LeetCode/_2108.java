public class _2108 {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            boolean flag= true;
            for( int j=0; j< s.length();j++){
                if(s.charAt(j)!=s.charAt(s.length()-j-1)){
                    flag= false;
                    break;
                }
            }
            if(flag) return s;
        }
        return "";
    }
    public static void main(String[] args){
        _2108 obj= new _2108();
        String[] words= new String[]{"dwcblqnxtrwtqmtqenidhxnifdbmdvobwmcvwjxgbyjzgvrqzlskjbfirauguhyyjhlotuckssrkqzppzbqd"};
        System.out.println(obj.firstPalindrome(words));
    }
}
