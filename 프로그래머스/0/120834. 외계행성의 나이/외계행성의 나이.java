import java.util.*;

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder("");
        // 알파벳으로 치환하기 
        while(age > 0){
            int n = age % 10;
            n += 97;
            char c = (char) n;
            sb.append(c);
            age /= 10;
        }
        return sb.reverse().toString();
    }
}