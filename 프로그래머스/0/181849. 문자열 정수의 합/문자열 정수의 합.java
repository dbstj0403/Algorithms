class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(int i=0; i<num_str.length(); i++){
            char c = num_str.charAt(i);
            
            // char -> int 자료형 변환시 Character.getNumericValue 메서드 사용
            int number = Character.getNumericValue(c);
            answer += number;
            
        }
        
        return answer;
    }
}