import java.util.*;

class Solution {
    public int solution(String before, String after) {
        // before의 순서를 바꾸어 after를 만들 수 있으면 1, 아니면 0
    
        char[] beforeList = before.toCharArray();
        char[] afterList = after.toCharArray();
        
        // 정렬하기
        Arrays.sort(beforeList);
        Arrays.sort(afterList);
        
        return Arrays.equals(beforeList, afterList) ? 1 : 0;  
    }
}