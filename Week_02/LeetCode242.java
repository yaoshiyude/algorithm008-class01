
public class LeetCode242 {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        int []table = new int[26];
        char []sArr = s.toCharArray();
        char []tArr = t.toCharArray();
        for(int i = 0;i<s.length();i++){
            table[sArr[i]-'a']++;
            table[tArr[i]-'a']--;
        }
        for(int item:table){
            if(item != 0){
                return false;
            }
        }
        return true;
    }

}
