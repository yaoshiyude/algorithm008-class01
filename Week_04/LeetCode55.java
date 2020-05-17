package 每日一题;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-17 16:41
 **/

public class LeetCode55 {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return true;
        }
        int left = nums.length - 2;
        int right = nums.length - 1;
        while (left >= 0) {
            if ((nums[left] + left) >= right) {
                right = left;
                left--;
            } else {
                left--;
            }
        }
        if (right == 0) {
            return true;
        } else {
            return false;
        }
    }

}
