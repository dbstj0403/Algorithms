class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 자연수 n을 연속한 자연수들로 표현하는 방법
        
        for(int i = 1; i <= n; i++){
            int sum = 0;
            
            for(int j = i; j <= n; j++){
                sum += j;
                if(sum == n){
                    answer++;
                }
                else if(sum > n){
                    break;
                }
            }
        }
        
        return answer;
    }
}