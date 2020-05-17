package 每日一题;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-17 16:45
 **/

public class LeetCode153 {

    public int findMin(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        if (nums[0] < nums[right]) {
            return nums[0];
        }
        while (left < right) {
            mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;

    }

}
