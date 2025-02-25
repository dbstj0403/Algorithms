class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // 세 개의 숫자가 모두 다르면 a + b + c
        // 두 숫자만 같으면 (a + b + c) * (a^2 + b^2 + c^2)
        // 세 숫자가 모두 같으면 (a + b + c) * (a^2 + b^2 + c^2) * (a^3 + b^3 + c^3)
        
        if(a == b && b == c){
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }
        else if(a == b || b == c || a == c){
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        else {
            answer = a + b + c;
        }
        
        return answer;
    }
}