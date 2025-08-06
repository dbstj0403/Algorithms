import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ");
 
        List<Integer> list = new ArrayList<>();
        for(String str : strs){
            int num = Integer.parseInt(str);
            list.add(num);
        }
        
        int min = Collections.min(list);
        int max = Collections.max(list);
        
        answer += String.valueOf(min);
        answer += " ";
        answer += String.valueOf(max);
        
        return answer;
    }
}