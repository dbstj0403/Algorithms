class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        // x부터 x씩 증가하는 숫자 n개 지닌 리스트 반환
        for(int i=0; i<n; i++){
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}