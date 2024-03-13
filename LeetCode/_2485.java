import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _2485 {
    public int pivotInteger(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        for(int i=1;i<=n;i++){
            if(sum== (i*i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        _2485 obj= new _2485();
        int n= 3;
        int ret= obj.pivotInteger(n);
        System.out.println(ret);
    }
}
