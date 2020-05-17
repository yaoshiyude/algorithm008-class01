package 每日一题;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-17 16:44
 **/

public class LeetCode74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int il = matrix.length;
        int jl = matrix[0].length;
        int left = 0;
        int right = il * jl - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (matrix[mid / jl][mid % jl] == target) {
                return true;
            }

            if (target > matrix[mid / jl][mid % jl]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
