class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 홀수인 경우
        if (n % 2 == 1){
            for (int i=0; i<=n; i++){
                if (i % 2 == 1){
                    answer += i;
                }
            }
        }
        // 짝수인 경우
        else {
            for (int i=0; i<=n; i++){
                if (i % 2 == 0){
                    answer += i*i;
                }
            }
        }
        
        return answer;
    }
}