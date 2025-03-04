import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length(); // p 문자열 길이
       
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<t.length() - len + 1; i++){
            list.add(t.substring(i, i + len));
        }

        for(int i=0; i<list.size(); i++){
            if(Long.valueOf(list.get(i)) <= Long.valueOf(p)){
                answer += 1;
            }
        }
        
        return answer;
    }
}