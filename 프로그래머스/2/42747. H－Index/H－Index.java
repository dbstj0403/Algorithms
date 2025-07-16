import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // 과학자가 발표한 논문 n편 중 h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 h-index
        // [0, 1, 3, 5, 6]
        Arrays.sort(citations);
        
        int len = citations.length;
        int hIndex = 0;
        
        for(int i = 0; i <= citations[len - 1]; i++){
            int highCount = 0;
            int rest = 0;
            for(int j : citations){
                if(j >= i){
                    highCount++;
                }
            }
            rest = len - highCount;
            
            System.out.println(highCount);
            System.out.println(rest);
            
            if(highCount >= i && rest <= i){
                hIndex = i;
            }
        }
        return hIndex;
    }
}