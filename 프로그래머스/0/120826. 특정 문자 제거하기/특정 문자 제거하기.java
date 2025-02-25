class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        int n = my_string.length(); // 문자열 길이
        
        for(int i=0; i<n; i++){
            char c = my_string.charAt(i);
            String str = String.valueOf(c);
            if(str.equals(letter)){
                continue;
            }
            else{
                answer += str;
            }
        }
        return answer;
    }
}