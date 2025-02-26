import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        // s 길이가 4 혹은 6이고 숫자로만 구성돼있는지 확인
        char [] chars = s.toCharArray(); // 문자 배열로 변환
        // 문자가 숫자인지 판별하는 메서드 : Character.isDigit();
        if(chars.length == 4 || chars.length == 6){
             for(char c : chars){
            if(Character.isDigit(c) == false){
                answer = false;
            }
        }
        }else{
            answer = false;
        }
       
        return answer;
    }
}