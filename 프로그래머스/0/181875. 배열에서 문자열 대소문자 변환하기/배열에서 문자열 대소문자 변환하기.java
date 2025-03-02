import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String [strArr.length];
    
        // 모든 원소가 알파벳, 홀수번째는 대문자로 짝수번째는 소문자로
        for(int i=0; i<strArr.length; i++){
            if(i % 2 == 1){
                answer[i] = strArr[i].toUpperCase();
            }
            else{
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }
}