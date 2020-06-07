package 每日一题;

/**
 思路：动态规划
 1、分解问题

 2、状态定义
 dp[i][j] 表示以点i,j为右下角的最大的全是1的正方形的边长
 3、dp方程
 dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
 解释：i,j点为右下角的最大边长正方形，等于她左边一点最大边长正方形，上边一点，左上一点中最小值+1
 **/
public class LeetCode221 {
    public int maximalSquare(char[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int li = matrix.length;
        int lj = matrix[0].length;
        int dp[][] = new int[li][lj];

        int maxSide = 0;

        for (int i = 0; i < li; i++) {
            for (int j = 0; j < lj; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else {
                    if (matrix[i][j] == '0') {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                    }
                }

                maxSide = Math.max(maxSide, dp[i][j]);
            }
        }
        return maxSide * maxSide;
    }
}
