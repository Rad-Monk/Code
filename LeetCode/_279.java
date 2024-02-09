

import java.util.ArrayList;
import java.util.List;

public class _279 {
    public int numSquares(int n) {
        List<Integer> list= new ArrayList<>();
        int c=1;
        while(true){
            if ((c*c)>n) break;
            list.add(c*c);
            c++;
        }
        c-=2;
        int maxcount=Integer.MAX_VALUE;
        for(int i=c; i>=0; i-- ){
            int counter= i;
            int sum=0;
            int count=0;
            while(true){
                if(sum == n){
//                    System.out.println(count);
                    break;
                }
                if((sum+list.get(counter))>n){
//                    System.out.println("sum: "+sum);
                    counter--;
//              count--;
                }
                else {
//                    System.out.println("sum in else:"+sum);
                    sum+= list.get(counter);
                    count++;
                }
            }
            boolean flag= false;
            if(count < maxcount){
                maxcount= count;
                flag=true;
            }
            if(!flag){
                break;
            }
        }

//      System.out.println(list.get(c-1));
//      System.out.println(list.remove(c));
//      System.out.println(list.removeLast());
        System.out.println(list);
        return maxcount;
    }
    public  static void main(String[] args){
        _279 obj= new _279();
        System.out.println(obj.numSquares(43));
    }
}