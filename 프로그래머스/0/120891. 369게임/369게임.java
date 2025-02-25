class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String sOrder = String.valueOf(order);
        
        for(int i=0; i<sOrder.length(); i++){
            char c = sOrder.charAt(i);
            
            // 문자열 비교는 equals 메서드 사용, char 자료형 비교이므로 작은 따옴표 사용
            if(c == '3' || c == '6' || c == '9'){
                answer += 1;
            }
        }
        
        return answer;
    }
}