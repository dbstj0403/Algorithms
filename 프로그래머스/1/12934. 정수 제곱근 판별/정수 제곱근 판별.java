import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // n이 양의 정수 x의 제곱이라면 x+1 제곱 리턴, 양의 정수 x의 제곱이 아니라면 -1 리턴
        long k = (long) Math.sqrt(n);
        if(n == k * k && k > 0){
            answer = (k + 1) * (k + 1);
        }
        else{
            answer = -1;
        }
        return answer;
    }
}