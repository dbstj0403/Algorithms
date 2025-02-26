class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // 정수 left ~ right 수 중에서 약수의 개수가 짝수인 수는 더하고 홀수인 수는 뺀 수 리턴
        for(int i=left; i<=right; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                // 1부터 i값까지 나눠지는 수 찾아서 약수 개수 카운트
                if(i % j == 0){
                    count++;
                }
                else{
                    continue;
                }
            }
            
            if(count % 2 == 0){
                answer += i;
            }
            else{
                answer -= i;
            }
        }
        return answer;
    }
}