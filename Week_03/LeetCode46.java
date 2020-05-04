
/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-04 17:17
 **/

public class LeetCode46 {
    public List<List<Integer>> permute(int[] nums) {

        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(length == 0){
            return res;
        }

        boolean []used = new boolean[length];
        List<Integer> tem = new ArrayList<>();
        per(length,res,tem,nums,used);

        return res;
    }

    private void per(int length, List<List<Integer>> res, List<Integer> tem, int[] nums, boolean[] used) {
        if(length == tem.size()){
            res.add(new ArrayList<>(tem));
            return;
        }

        for (int i = 0; i < length; i++) {
            if(used[i]){
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
