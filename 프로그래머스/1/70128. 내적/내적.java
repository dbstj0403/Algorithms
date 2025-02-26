class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int n = a.length - 1;
        // 1차원 정수 배열 a, b 이 둘의 내적을 리턴
        for(int i=0; i<=n; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}