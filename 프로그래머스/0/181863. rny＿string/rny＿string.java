class Solution {
    public String solution(String rny_string) {
        String answer = "";
        // 모든 m을 'rn'으로 바꾼 문자열 리턴
        answer = rny_string.replace("m", "rn");
        return answer;
    }
}