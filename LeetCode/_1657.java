import java.util.*;
public class _1657 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        char[] arr1= word1.toCharArray();
        char[] arr2= word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] freq1= new int[26];
        int[] freq2= new int[26];
        for (int i =0; i < arr1.length; i++){
            freq1[arr1[i]-'a']++;
            freq2[arr2[i]-'a']++;
        }
        List<Integer> f1= new ArrayList<>();
        List<Integer> f2= new ArrayList<>();

        for(int i =0; i <26;i++){
            f1.add(freq1[i]);
            f2.add(freq2[i]);
        }
        for (int i =0; i <26 ; i++){
            if((f1.get(i)==0 && f2.get(i) !=0)|| (f1.get(i)!=0 && f2.get(i) ==0) ){
                return false;
            }
        }
        for(int i=0; i< 26;i++){
            if(!f1.contains(f2.get(i))) {
                System.out.print(f2.get(i)+ " in if");
                return false;
            }
            f1.set(f1.indexOf(f2.get(i)),0);
            f2.set(f2.indexOf(f2.get(i)),0);
        }
        return true;

    }
    public static void main(String[] args){
        _1657 obj= new _1657();
        System.out.println(obj.closeStrings("aabbbceedfi","abbcccddegh"));
    }
}
