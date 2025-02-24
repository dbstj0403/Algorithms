class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sheep = 12000 * n;
        int drink = 2000 * k;
        
        drink = drink - (n / 10) * 2000;
        answer = sheep + drink;
        
        return answer;
    }
}