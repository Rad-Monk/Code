public class _122 {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int diff = 0;
        int result =0;
        for (int i=1;i<prices.length;i++) {
            if (prices[i-1]< prices[i]) {
                diff = Math.max(diff, prices[i]-minValue);
            } else {
                minValue = prices[i];
                result+=diff;
                diff=0;
            }
        }
        return result+diff;
    }
}
