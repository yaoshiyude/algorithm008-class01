
public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }
        int n = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                n++;
            }else{
                if(n !=0){
                    nums[i-n] = nums[i];
                }
            }
        }

        for(int i = nums.length-n;i<nums.length;i++){
            nums[i] = 0;
        }
    }

}
