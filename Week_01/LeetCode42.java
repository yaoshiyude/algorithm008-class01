
public class LeetCode42 {

    public int trap(int[] height) {
        int left = 0,right = height.length-1,leftMax=0,rightMax=0,res=0;
        while (left<=right){
            if(leftMax<=rightMax){
                leftMax = Math.max(leftMax,height[left]);
                res = res+leftMax-height[left++];
            }else {
                rightMax = Math.max(rightMax,height[right]);
                res = res+rightMax-height[right--];
            }
        }
        return res;
    }

    public static int trap2(int[] height) {

        Stack<Integer> stack = new Stack<>();
        if(null == height || height.length == 0){
            return 0;
        }
        int res = 0;
        int index;

        for (int i = 0;i<height.length;i++){
            while (!stack.isEmpty() && height[stack.peek()]<height[i]){
                index = stack.pop();
                while (!stack.isEmpty() && height[stack.peek()]==height[index]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    int high = Math.min(height[i],height[stack.peek()]) - height[index];
                    int width = i-stack.peek()-1;
                    res = res+high*width;
                }
            }
            stack.add(i);
        }
        return res;
    }

}
