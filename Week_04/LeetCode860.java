package 每日一题;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-14 01:12
 **/

public class LeetCode860 {

    public boolean lemonadeChange(int[] bills) {
        int []dollar = new int[11];
        for(int i = 0;i<bills.length;i++){
            if(bills[i] == 5){
                dollar[5]++;
            }else if(bills[i] == 10){
                if(dollar[5]>0){
                    dollar[5]--;
                    dollar[10]++;
                }else{
                    return false;
                }
            }else{
                if(dollar[10]>0 && dollar[5]>0){
                    dollar[10]--;
                    dollar[5]--;
                }else if(dollar[5]>2){
                    dollar[5] = dollar[5]-3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

}
