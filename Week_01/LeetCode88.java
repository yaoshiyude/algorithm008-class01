
public class LeetCode88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []res = new int[m+n];
        int i=0;
        int j=0;
        int resIndex = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[resIndex++] = nums1[i++];
            }else{
                res[resIndex++] = nums2[j++];
            }
        }
        while(i<m){
            res[resIndex++] = nums1[i++];
        }
        while(j<n){
            res[resIndex++] = nums2[j++];
        }
        for(int k = 0;k<m+n;k++){
            nums1[k] = res[k];
        }

    }

}
