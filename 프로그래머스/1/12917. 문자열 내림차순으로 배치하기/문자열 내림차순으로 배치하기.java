import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자를 큰것부터 작은 순으로 정렬해서 리턴
        char [] chars = s.toCharArray(); // 문자 배열로 변환
        Arrays.sort(chars); // 오름차순 정렬
        StringBuilder sb = new StringBuilder(new String(chars));
        // 문자열로만 초기화 가능
        sb.reverse();
        
        return sb.toString();
    }
}