import java.util.*;

class Solution {
    public String solution(String my_string) { 
        // 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열 리턴
        String str = my_string.toLowerCase();
        char[] list = str.toCharArray();
        Arrays.sort(list);
        String answer = new String(list);
        return answer;
    }
}