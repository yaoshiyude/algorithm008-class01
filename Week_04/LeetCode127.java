package 每日一题;

import java.util.*;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-10 14:44
 **/

public class LeetCode127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int length = beginWord.length();
        Map<String,List<String>> keyMap = new HashMap<>();

        wordList.forEach(item ->{
            for (int i = 0; i <length ; i++) {
                String newStr = item.substring(0,i)+"-"+item.substring(i+1,length);
                List<String> tems = keyMap.getOrDefault(newStr,new ArrayList<>());
                tems.add(item);
                keyMap.put(newStr,tems);
            }
        });
        Map<String,Integer> flag = new HashMap<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        int res = 1;

        while (!queue.isEmpty()){
            int size = queue.size();

            while (size-->0){

                String tem = queue.poll();
                flag.put(tem,0);
                if(tem.equals(endWord)){
                    return res;
                }

                for (int i = 0; i < length; i++) {
                    String newTem = tem.substring(0,i)+"-"+tem.substring(i+1,length);

                    for (String str:keyMap.getOrDefault(newTem,new ArrayList<>())) {

                        if(!flag.containsKey(str)){
                            queue.add(str);
                        }

                    }
                }
            }
            res++;
        }

        return 0;

    }

}
