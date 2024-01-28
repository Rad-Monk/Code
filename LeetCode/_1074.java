import java.util.HashMap;

public class _1074 {
    public int sumOfSum(int[] arr, int tar){
        int count= 0;
        int sum=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i =0; i< arr.length ; i++){
            sum += arr[i];
            if(sum==tar){
                count++;
            }
            if( map.containsKey(sum-tar)){
                count+= map.get(sum-tar);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count=0;
        for (int i=0; i< matrix.length; i++){
            int[] sum= new int[matrix[0].length];
            for(int j = i; j< matrix.length ; j++){
                for(int k=0; k< sum.length; k++){
                    sum[k]+=matrix[j][k];
                }
                count+= sumOfSum(sum, target);
            }
        }
        return count;
    }
}
