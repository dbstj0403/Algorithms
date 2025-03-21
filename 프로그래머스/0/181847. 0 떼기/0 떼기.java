import java.util.*;

class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        // 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열 리턴
        char[] chars = n_str.toCharArray();
        boolean isLeft = true;
        if(chars[0] == '0'){
            for(int i=0; i<chars.length; i++){
                if(chars[i] == '0' && isLeft == true){
                    continue;
                }
                else{
                    sb.append(chars[i]);
                    isLeft = false;
                }
            }
        }
        else{
            return n_str;
        }
        return sb.toString();
    }
}