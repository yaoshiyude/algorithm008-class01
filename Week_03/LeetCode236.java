/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-04 18:56
 **/

public class LeetCode236 {

    TreeNode res;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        before(root,p,q);
        return res;
    }

    private boolean before(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return false;
        }

        int mid = (root == p || root == q) ? 1 : 0;

        int left = before(root.left,p,q) ? 1 : 0;

        int right = before(root.right,p,q) ? 1 : 0;

        if((mid+left+right) >=2){
            res = root;
        }

        return (mid+left+right)>0;

    }
}
