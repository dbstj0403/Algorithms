class Solution {
    public String solution(String my_string, int num1, int num2) {
        // 문자열에서 인덱스 num1과 num2에 해당하는 문자를 바꾼 문자열 리턴
        // 일단 문자열을 문자 배열로 변환
        char [] chars = my_string.toCharArray();
        char c1 = chars[num1];
        char c2 = chars[num2];
        chars[num1] = c2;
        chars[num2] = c1;
        String str = new String(chars);
        return str;
    }
}