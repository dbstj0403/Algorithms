class Solution {
    public String solution(String myString) {
        String answer = "";
        char l = 'l';
        int value = (int) l;
        // l보다 앞서는 모든 문자를 l로 바꾼 문자열 리턴
        for(char c : myString.toCharArray()){
            int code = (int) c;
            if(code < value){
                answer += "l";
            }
            else{
                answer += c;
            }
        }
        return answer;
    }
}