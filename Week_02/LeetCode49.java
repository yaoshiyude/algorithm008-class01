
public class LeetCode589 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> sMap = new HashMap<>();
        for(String str: strs){
            char []sArr = str.toCharArray();
            Arrays.sort(sArr);
            String key = new String(sArr);
            if(sMap.containsKey(key)){
                sMap.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                sMap.put(key,list);
            }
        }
        return new ArrayList(sMap.values());
    }
}
