public class _66 {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] < 9){
            digits[digits.length-1]= digits[digits.length-1] + 1;
            return digits;
        }

        int last= digits.length-1;
        while (digits[last] ==9 ){
            if (last==0 ){
                if (digits[last]==9){
                    int[] newdig= new int[digits.length+1];
                    newdig[0]=1;
                    for (int i= 1; i< newdig.length;i++){
                        newdig[i]=0;
                    }
                    return newdig;
                }
                else {
                    break;
                }
            }
            digits[last]=0;
            last--;
        }
        digits[last]=digits[last] + 1;
        return  digits;
    }
}
