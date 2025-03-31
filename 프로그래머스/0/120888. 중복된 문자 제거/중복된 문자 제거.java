import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        // 중복된 문자 제거하고 하나만 남긴 문자열 리턴
        for(int i=0; i<my_string.length(); i++){
            if(list.contains(my_string.charAt(i))){
                continue;
            }
            else{
                sb.append(my_string.charAt(i));
                list.add(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}