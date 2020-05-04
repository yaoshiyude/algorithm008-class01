
/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-04 16:35
 **/

public class LeetCode77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n<0 || k<0 || n<k){
            return res;
        }
        com(n,1,k,res,new ArrayList<>());
        return res;
    }

    private void com(int n,int begin, int k,List<List<Integer>> res, List<Integer> tem){

        if(tem.size() == k){
            res.add(new ArrayList(tem));
            return;
        }

        for(int i = begin;i<=n;i++){
            tem.add(i);
            com(n,i+1,k,res,tem);

            //回溯
            tem.remove(tem.size()-1);
        }
    }

}
