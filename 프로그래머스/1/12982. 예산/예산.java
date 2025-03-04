import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 부서별 신청 금액 배열 d, 예산 budget
        // 최대한 많은 부서 지원해 주기!
        // 일단 작은 것부터 더해나가야 함 
        Arrays.sort(d); // 오름차순 정렬
        int sum = 0;
        for(int i=0; i<d.length; i++){
            if(sum >= budget){
                break;
            }
            if(sum + d[i] > budget){
                break;
            }
            sum += d[i];
            answer += 1;
        }
        
        return answer;
    }
}