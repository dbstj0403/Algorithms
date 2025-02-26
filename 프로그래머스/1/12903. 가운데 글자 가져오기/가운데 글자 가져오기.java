class Solution {
    public String solution(String s) {
        String answer = "";
        // 단어 s의 가운데 글자 반환 짝수라면 가운데 두 글자 반환
        // 문자열을 배열로 변환
        char [] chars = s.toCharArray();
        if(chars.length % 2 == 0){
            answer += "" + chars[chars.length / 2 - 1] + chars[chars.length / 2];
        }
        else{
            answer += chars[chars.length / 2];
        }
        return answer;
    }
}