
public class LeetCode347 {

    public int[] topKFrequent(int[] nums, int k) {

        if(k == 0 || nums.length == 0){
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>((o1,o2)->o2.getValue()-o1.getValue());

        for(Map.Entry<Integer, Integer> item :map.entrySet()){
            priorityQueue.add(item);
        }

        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i] = priorityQueue.poll().getKey();
        }
        return res;

    }
}
