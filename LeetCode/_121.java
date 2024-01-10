public class _121 {
    public int maxProfit(int[] prices) {
        int maxdiff=Integer.MIN_VALUE;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int totprofit=0;
        for ( int i=0; i< prices.length; i++){
            if ( prices[i] < min){
                min= prices[i];
                max= prices[i];

            }
            if ( prices[i] > max){
                max= prices[i];
                totprofit= max-min;
                min=prices[i];
            }
        }
        return totprofit;
    }
}
