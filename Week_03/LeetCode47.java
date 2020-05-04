package 每日一题;

import org.omg.CORBA.IMP_LIMIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-04 17:45
 **/

public class LeetCode47 {

    public List<List<Integer>> permuteUnique(int[] nums) {

        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }

        List<Integer> tem = new ArrayList<>();
        boolean []used = new boolean[length];
        Arrays.sort(nums);
        per(length,res,tem,nums,used);

        return res;
    }

    private void per(int length, List<List<Integer>> res, List<Integer> tem, int[] nums, boolean[] used) {
        if(tem.size() == length){
            res.add(new ArrayList<>(tem));
            return;
        }

        for (int i = 0; i <length ; i++) {
            if(used[i]){
                continue;
            }

            //剪枝
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }

            tem.add(nums[i]);
            used[i] = true;

            per(length,res,tem,nums,used);

            //回溯
            tem.remove(tem.size()-1);
            used[i] = false;
        }
    }

}
