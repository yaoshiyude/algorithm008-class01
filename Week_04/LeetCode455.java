package 每日一题;

import java.util.Arrays;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-17 16:39
 **/

public class LeetCode455 {

    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null || g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int length = g.length;
        int j = 0;
        int res = 0;
        for (int i = 0; i < s.length; i++) {
            if (j >= length) {
                break;
            }
            if (s[i] >= g[j]) {
                j++;
                res++;
            }
        }

        return res;

    }

}
