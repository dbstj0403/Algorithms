class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        // 문자열에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열 리턴
        answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
}