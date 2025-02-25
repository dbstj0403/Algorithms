class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제곱근 구하는 방법 Math.sqrt 메서드 사용
        int sqrt = (int) Math.sqrt(n);
        if(sqrt * sqrt == n){
            answer = 1;
        }
        else{
            answer = 2;
        }
        return answer;
    }
}