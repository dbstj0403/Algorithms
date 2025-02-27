class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // my_string 안의 모든 자연수들의 합 리턴
        for(char c : my_string.toCharArray()){
            // char 숫자인지 아닌지 확인 -> Character.isDigit()
            if(Character.isDigit(c)){
                answer += Character.getNumericValue(c);
            }
        }
        return answer;
    }
}