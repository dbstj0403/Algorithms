import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // x를 기준으로 문자열을 잘라 배열을 만든 후 사전순으로 정렬한 배열 리턴
        String[] parts = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(String s : parts){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}