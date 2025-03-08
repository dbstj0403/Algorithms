class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // 문자열 뒤의 n글자로 이루어진 문자열 리턴
        int len = my_string.length();
        answer = my_string.substring(len - n, len);
        return answer;
    }
}