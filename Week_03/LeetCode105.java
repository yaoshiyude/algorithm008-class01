/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-04 22:10
 **/

public class LeetCode105 {

    int []preorder;
    int []inorder;
    int index = 0;
    Map<Integer,Integer> kv = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        for (int i = 0; i < inorder.length; i++) {
            kv.put(inorder[i],i);
        }

        return build(0,inorder.length);
    }

    private TreeNode build(int left, int right) {

        if(left == right){
            return null;
        }

        int tem = kv.get(preorder[index]);

        TreeNode root = new TreeNode(preorder[index++]);

        root.left = build(left,tem);

        root.right = build(tem+1,right);

        return root;
    }


}
