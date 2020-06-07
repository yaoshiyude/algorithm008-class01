package 每日一题;

/**
 * 思路：动态规划
 * 1、问题分解
 * 可以从字符串的后向前看
 * 2、状态定义
 * dp[i] 表示从i到n-1可以有多少种解法
 * 3、dp方程
 * 当i到i+1代表的数字小于等于26
 * dp[i] = dp[i+1]+dp[i+2]
 * 当i代表的数字为0
 * dp[i] = 0
 * 当i到i+1代表的数字大于26
 * dp[i] = dp[i+1]
 **/

public class LeetCode91 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1 && !s.equals("0")) {
            return 1;
        }
        if(s.length() == 1){
            return 0;
        }
        int l = s.length();

        int dp[] = new int[l];
        int lastNumber = s.charAt(l - 1) - '0';
        int firstNumber = s.charAt(l - 2) - '0';
        if (lastNumber != 0) {
            dp[l - 1] = 1;
        }
        if (firstNumber != 0 && firstNumber * 10 + lastNumber <= 26) {
            dp[l - 2] = 1+dp[l-1];
        } else if (firstNumber != 0 && firstNumber * 10 + lastNumber > 26) {
            dp[l - 2] = dp[l-1];
        }

        if (s.length() == 2) {
            return dp[0];
        }

        for (int i = l - 3; i >= 0; i--) {

            int ten = s.charAt(i) - '0';
            if (ten == 0) {
                continue;
            }
            int bit = s.charAt(i + 1) - '0';
            if (ten * 10 + bit <= 26) {
                dp[i] = dp[i + 1] + dp[i + 2];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        LeetCode91 leetCode91 = new LeetCode91();
        leetCode91.numDecodings("226");
    }
}
