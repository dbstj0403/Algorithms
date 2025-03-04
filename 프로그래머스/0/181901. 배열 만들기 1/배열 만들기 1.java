class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        // 1 이상 n 이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열 리턴
        int num = 0;
        for(int i=1; i<=n; i++){
            if(i % k == 0){
                answer[num] = i;
                num++;
            }
        }
        return answer;
    }
}