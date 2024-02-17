import java.util.*;

import static java.lang.Long.sum;

public class _1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue= new PriorityQueue<>((a,b)->b-a);
        int i,diff;
        for(i=0; i<heights.length-1;i++){
            diff= heights[i+1]-heights[i];
            if(diff<=0){
                continue;
            }
            bricks-=diff;
            queue.offer(diff);
            if(bricks<0){
                bricks+=queue.poll();
                ladders--;
            }
            if(ladders<0){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args){
        _1642 obj= new _1642();
        int[] heights= new int[]{1,5,1,2,3,4,10000};
        System.out.println(obj.furthestBuilding(heights,4,1));
    }
}
