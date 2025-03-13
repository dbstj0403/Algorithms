class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        // 암호화된 문자열에서 code의 배수 번째 글자수만 진짜 암호
        for(int i=0; i<cipher.length(); i++){
            if((i + 1) % code == 0){
                answer += str[i];
            }
        }
        return answer;
    }
}