public class _907 {
    public int sumSubarrayMins(int[] arr) {
        long sum=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i; j< arr.length;j++){

                int min=Integer.MAX_VALUE;

                for(int k =i; k<=j;k++){

                    System.out.println("k: "+k);
                    if(min > arr[k]) min=arr[k];
                }

                if(i==j){

                    System.out.println("s1: "+sum+", at i:"+i+", j: "+j);
                    sum+=arr[i];
                    System.out.println("s2: "+sum+", at i:"+i+", j: "+j);


                }
                else{
                    System.out.println("s3: "+sum+", at i:"+i+", j: "+j);
                    sum+=min;
                    System.out.println("s4: "+sum+", at i:"+i+", j: "+j);
                }
            }
        }
        return (int)(sum % (1000000000+7));
    }
    public static void main(String[] args){
        _907 obj= new _907();
        int[] arr= new int[]{3,1,2,4};
        long sum= obj.sumSubarrayMins(arr);
        System.out.println("sum is: "+ sum);
    }
}
