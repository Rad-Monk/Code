public class _931 {
    class Solution {
        public static int minFallingPathSum(int[][] matrix) {
            int n = matrix.length;
            // dp array to store the minimum sum up to each cell
            int[][] dp = new int[n][n];

            // Copy the first row of matrix to dp as the base case
            System.arraycopy(matrix[0], 0, dp[0], 0, n);

            // Iterate over the matrix starting from the second row
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Consider the cell directly above
                    int minAbove = dp[i - 1][j];
                    // Consider the cell diagonally above-left if it exists
                    if (j > 0) {
                        minAbove = Math.min(minAbove, dp[i - 1][j - 1]);
                    }
                    // Consider the cell diagonally above-right if it exists
                    if (j < n - 1) {
                        minAbove = Math.min(minAbove, dp[i - 1][j + 1]);
                    }
                    // Update the dp array with the minimum sum up to the current cell
                    dp[i][j] = matrix[i][j] + minAbove;
                }
            }

            // Find the minimum value in the last row of dp
            int minPathSum = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                minPathSum = Math.min(minPathSum, dp[n - 1][j]);
            }

            return minPathSum;
        }
    }
}
