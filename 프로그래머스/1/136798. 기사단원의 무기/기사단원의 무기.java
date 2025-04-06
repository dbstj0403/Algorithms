import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        // 기사들은 각자의 번호가 있고, 자기 번호의 약수의 개수에 해당하는 공격력 무기를 사려고 함.
        // 제한 수치보다 큰 공격력 무기를 구매하려면 정해진 공격력 무기를 구매해야 함.
        // 약수 개수 구하기 -> 제곱근까지의 개수 구해서 두배하기.
        int answer = 0;
        for(int i=1; i<=number; i++){
            int count = 0;
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    if(j * j == i){
                        count++;
                    }
                    else{
                        count += 2;
                    }
                }
            }
            
            if(count > limit){
                answer += power;
            }
            else{
                answer += count;
            }
        }
        
        return answer;
    }
}