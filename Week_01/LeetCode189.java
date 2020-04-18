
public class LeetCode189 {

    public void rotate(int[] nums, int k) {
        if(k == 0 || null == nums || nums.length <2){
            return;
        }
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums,int left,int right){
        while(left<right){
            int tem = nums[left];
            nums[left++] = nums[right];
            nums[right--] = tem;
        }
    }

}
