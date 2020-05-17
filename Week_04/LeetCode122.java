package 每日一题;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-17 16:38
 **/

public class LeetCode122 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }

}
