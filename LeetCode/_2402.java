import java.lang.reflect.Array;
import java.util.*;

public class _2402 {

    public int mostBooked(int n, int[][] meetings) {
        int[] ans = new int[n];
        long[] times = new long[n];
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0], end = meetings[i][1];
            boolean flag = false;
            int minind = -1;
            long val = Long.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (times[j] < val) {
                    val = times[j];
                    minind = j;
                }
                if (times[j] <= start) {
                    flag = true;
                    ans[j]++;
                    times[j] = end;
                    break;
                }
            }
            if (!flag) {
                ans[minind]++;
                times[minind] += (end - start);
            }
        }

        int maxi = -1, id = -1;
        for (int i = 0; i < n; i++) {
            if (ans[i] > maxi) {
                maxi = ans[i];
                id = i;
            }
        }
        return id;
    }



//    public int mostBooked(int n, int[][] meetings) {
//        Arrays.sort(meetings, Comparator.comparing(arr-> arr[0]));
//        PriorityQueue<Integer> ongoing= new PriorityQueue<>(Comparator.comparingInt(a -> a));
//        PriorityQueue<Integer> waiting= new PriorityQueue<>(Comparator.comparingInt(a -> a));
////        HashMap<Integer, int[]> map= new HashMap<>(n);
//        for( int i=0; i< meetings[meetings.length-1][0]; i++){
//            if(i==meetings[i][0] && n!=0){
//                ongoing.offer(meetings[i][1]);
//                n--;
//            }
//            if(i==meetings[i][0] && n==0){
//                waiting.offer(meetings[i][0]);
//            }
//            if(i!=meetings[i][0] )
//        }
//        return 0;
//    }
    public static void main(String[] args){
        _2402 obj= new _2402();
        int[][] meetings= new int[][]{{19,18},{3,12},{17,19},{2,13},{7,10}};
        System.out.println(obj.mostBooked(3,meetings));
    }
}
