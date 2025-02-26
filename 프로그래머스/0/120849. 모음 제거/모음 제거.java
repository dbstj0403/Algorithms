import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 주어진 문자열에서 a, e, i, o, u 모음 제거
        
        for(char c : my_string.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                continue;
            }
            else{
                String str = String.valueOf(c);
                answer += str;
            }
        }
        return answer;
    }
}