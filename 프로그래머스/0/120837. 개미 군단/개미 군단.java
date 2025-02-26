class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 장군 개미 5 병정 개미 3 일개미 1 공격력
        // 사냥감의 체력에 맞게 최소한의 병력 구성
        
        int g = 0;
        int b = 0;
        int i = 0;
        int remain = 0;
        
        g = hp / 5;
        remain = hp - 5 * g;
        
        b = remain / 3;
        remain = remain - 3 * b;
        
        i = remain;
        
        answer = g + b + i;
        return answer;
    }
}