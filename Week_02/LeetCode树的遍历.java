
public class LeetCode94 {

    List<Integer> res = new ArrayList<>();

    /**
     * 中序
     **/
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
            if(root.left != null){
                inorderTraversal(root.left);
            }
            res.add(root.val);
            if(root.right != null){
                inorderTraversal(root.right);
            }
        }
        return res;
    }

    /**
     * 前序
     **/
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            res.add(root.val);
            if(root.left != null){
                preorderTraversal(root.left);
            }
            if(root.right != null){
                preorderTraversal(root.right);
            }
        }
        return res;

    }

    /**
     * 多叉树层序 广度优先搜索
     **/
    public List<List<Integer>> levelOrder(Node root) {

        if(root == null){
            return new ArrayList<>();
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
        while(!queue.isEmpty()){
            List<Integer> vals = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i<size;i++){
                Node node = queue.poll();
                vals.add(node.val);
                queue.addAll(node.children);
            }
            res.add(vals);
        }
        return res;
    }

}
