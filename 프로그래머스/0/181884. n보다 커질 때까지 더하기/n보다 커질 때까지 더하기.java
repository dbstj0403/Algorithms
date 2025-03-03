class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        // numbers 원소를 더하다가 n보다 더 커지는 순간 합 리턴
        for(int i : numbers){
            if(answer > n){
                break;
            }
            answer += i;
        }
        return answer;
    }
}