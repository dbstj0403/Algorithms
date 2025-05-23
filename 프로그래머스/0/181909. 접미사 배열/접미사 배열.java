import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        int len = my_string.length();
        StringBuilder sb = new StringBuilder();
        for(int i = len - 1; i >= 0; i--){
            char c = my_string.charAt(i);
            sb.insert(0, c);
            list.add(sb.toString());
        }
        
        Collections.sort(list);
       
        return list.toArray(new String[0]);
    }
}