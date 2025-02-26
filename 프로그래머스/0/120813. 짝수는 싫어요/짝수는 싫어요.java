class Solution {
    public int[] solution(int n) {
        // n 이하의 홀수 개수 구하기
        int count = 0;
        if(n % 2 == 0){
            count = n / 2;
        }
        else{
            count = n / 2 + 1;
        }
        
        int[] answer = new int[count];
        
        // n 이하의 홀수가 오름차순으로 담긴 배열 리턴
        int j = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer[j] = i;
                j++;
            }
        }
        
        return answer;
    }
}