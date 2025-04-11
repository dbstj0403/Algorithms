import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i=0; i<targets.length; i++){
            int total = 0;
            for(int j=0; j<targets[i].length(); j++){
                char ch = targets[i].charAt(j); // 한글자 픽
                int min = Integer.MAX_VALUE;
                for(int k=0; k<keymap.length; k++){
                    int idx = keymap[k].indexOf(ch);
                    if(idx != -1){
                        min = Math.min(min, idx + 1);
                    }
                }
                if(min == Integer.MAX_VALUE){
                    total = -1;
                    break;
                }
                total += min;
            }
            answer[i] = total;
        }
        return answer;
    }
}