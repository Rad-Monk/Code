public class _645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long sumNums = 0;
        long sumNumsSquares = 0;
        long sumExpected = n * (n + 1L) / 2;
        long sumSquaresExpected = n * (n + 1L) * (2L * n + 1L) / 6;

        for (int num : nums) {
            sumNums += num;
            sumNumsSquares += (long) num * num;
        }

        long diff = sumExpected - sumNums;
        long diffSquares = sumSquaresExpected - sumNumsSquares;

        // Solving for x and y
        long y_plus_x = diffSquares / diff;
        int x = (int) ((y_plus_x - diff) / 2);
        int y = (int) (diff + x);

        return new int[]{x, y};
    }
}
