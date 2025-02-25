class Solution {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        int coffee = money / 5500;
        int change = money % 5500;
        answer[0] = coffee;
        answer[1] = change;
        
        return answer;
    }
}