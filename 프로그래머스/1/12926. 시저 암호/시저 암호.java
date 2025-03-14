class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            answer.append(change(c, n)); // 한 글자씩 변환
        }
        
        return answer.toString();
    }

    public static char change(char c, int n) {
        if (Character.isUpperCase(c)) {  // 대문자 A-Z 처리
            return (char) ('A' + (c - 'A' + n) % 26);
        } else if (Character.isLowerCase(c)) {  // 소문자 a-z 처리
            return (char) ('a' + (c - 'a' + n) % 26);
        } else {
            return c;  // 공백 또는 다른 문자 그대로 유지
        }
    }
}
