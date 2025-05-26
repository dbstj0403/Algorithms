import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        // aya, ye, woo, ma 발음만 가능
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
    
        for(String bab : babbling){
            for(String say : can){
                if(bab.contains(say)){
                    bab = bab.replaceAll(say, ",");
                    if(bab.replaceAll(",", "").isEmpty()){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}