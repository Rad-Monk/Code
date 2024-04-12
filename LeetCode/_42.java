public class _42 {
    public int trap(int[] height) {
        int size = height.length -1;
        int water=0;
        int temp = 0;
        int prev = height[0];
        int prev_index = 0;
        for(int i = 1; i<= size; i++){
            if(height[i] >= prev){
                prev = height[i];
                prev_index = i;
                temp = 0;
            }
            else{
                water+= prev-height[i];
                temp+= prev-height[i];
            }
        }
        if(prev_index<size){
            water-=temp;
            prev = height[size];
            for(int i = size; i>=prev_index;i--){
                if(height[i]>=prev){
                    prev= height[i];
                }
                else{
                    water+=prev-height[i];
                }
            }
        }
        return water;
    }
}

