import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 약수가 세 개 이상인 수 = 합성수 n 이하의 합성수의 개수 리턴
        // 약수 개수 구할 때 제곱근 이하 개수 두배로 구하자
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    if(i / j == j){
                        count++;
                    }
                    else{
                        count += 2;
                    }
                }
            }
            if(count >= 3){
                answer++;
            }
        }
        return answer;
    }
}