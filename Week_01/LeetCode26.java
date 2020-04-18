
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if(null == nums){
            return 0;
        }
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int n = 0;
        int tem = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(tem == nums[i]){
                n++;
                continue;
            }

            if(n != 0){
                nums[i-n] = nums[i];
            }
            tem = nums[i-n];
        }
        return nums.length-n;
    }

    public int removeDuplicates2(int[] nums) {
        if(null == nums){
            return 0;
        }
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                j++;
            }else{
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

}
