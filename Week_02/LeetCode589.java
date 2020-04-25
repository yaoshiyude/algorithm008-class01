
public class LeetCode589 {

    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root != null){
            res.add(root.val);
            if(root.children != null ){
                for(int i=0;i<root.children.size();i++){
                    preorder(root.children.get(i));
                }
            }
        }
        return res;

    }

    /**
     * 遍历实现
     **/
    public List<Integer> preorder2(Node root) {
        if(root == null){
            return new ArrayList();
        }
        Deque<Node> deque = new ArrayDeque<>();
        deque.addFirst(root);

        while(!deque.isEmpty()){
            Node node = deque.pollFirst();
            res.add(node.val);
            if(node.children != null){
                for(int i = node.children.size()-1;i>=0;i--){
                    deque.addFirst(node.children.get(i));
                }
            }
        }
        return res;
    }

}
