class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        // 부분 문자열들을 붙여서 반환
        for(int i=0; i<my_strings.length; i++){
            int a = parts[i][0];
            int b = parts[i][1];
            String str = my_strings[i].substring(a, b + 1);
            answer += str;
        }
        return answer;
    }
}