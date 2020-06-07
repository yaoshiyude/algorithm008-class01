package 每日一题;

/**
 * 思路：动态规划
 * 1、问题分解
 * 从右下角向左上看
 * 2、状态设计
 * dp[i][j]：i,j点到右下角的最小路径和
 * 3、dp方程
 * dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
 **/
public class LeetCode64 {
    public int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j != n - 1) {
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                } else if (i != m - 1 && j == n - 1) {
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                } else if (i == m - 1 && j == n - 1) {
                    dp[m - 1][n - 1] = grid[m - 1][n - 1];
                } else {
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
}
