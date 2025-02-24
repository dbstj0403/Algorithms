class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double d1 = num1;
        double d2 = num2;
        double result;
        result = (d1 / d2) * 1000;
        answer = (int) result;
        return answer;
    }
}