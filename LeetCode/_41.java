import java.util.Arrays;

public class _41 {
    public int firstMissingPositive(int[] nums) {
        int[] nodupes= Arrays.stream(nums).distinct().toArray();
        Arrays.sort(nodupes);
        int j=0, i = 1;
        if(nodupes.length==1){
            if(nodupes[0]!=1) return 1;
            return ++nodupes[0];
        }
        while(nodupes[j]<=0){
            j++;
            if(j == nodupes.length) return 1;
        }
        while(j<nodupes.length){
            if(i!=nodupes[j]) return i;
            j++; i++;
//            System.out.println(j+" "+i);
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{0,2,2,1,1};
        _41 obj= new _41();
        int res= obj.firstMissingPositive(nums);
        System.out.println(res);
    }
}
