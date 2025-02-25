class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            String sc1 = String.valueOf(c1);
            String sc2 = String.valueOf(c2);
            answer += sc1 + sc2;
        }
        return answer;
    }
}