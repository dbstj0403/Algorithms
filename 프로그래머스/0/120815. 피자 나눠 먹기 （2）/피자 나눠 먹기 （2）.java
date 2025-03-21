class Solution {
    public int solution(int n) {
        int answer = 1;
        // n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면?
        while((6 * answer) % n != 0){
            answer += 1;
        }
        return answer;
    }
}