import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int num : numbers){
            String str = String.valueOf(num);
            list.add(str);
        }
        
        // 리스트에 넣은 숫자들을 앞자리 숫자가 큰 순서대로 정렬
        list.sort((a, b) -> (b + a).compareTo(a + b));
        
        for(String s : list){
            sb.append(s);
        }
        
        if(sb.toString().startsWith("0")){
            return "0";
        }
        
        return sb.toString();
    }
}