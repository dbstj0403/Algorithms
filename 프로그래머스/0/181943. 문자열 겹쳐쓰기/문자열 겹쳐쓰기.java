class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int n = my_string.length();
        int k = overwrite_string.length();
        // 문자열 슬라이싱은 substring을 사용함.
        String sliced = my_string.substring(0, s);
        String remaind = my_string.substring(s + k);
        answer = sliced + overwrite_string + remaind;
        return answer;
    }
}