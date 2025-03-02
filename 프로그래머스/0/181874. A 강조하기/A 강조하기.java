class Solution {
    public String solution(String myString) {
        String answer = "";
        // "a" -> "A" A가 아닌 모든 대문자 알파벳은 소문자로
        answer = myString.replace("a", "A");
        String temp = answer.replace("A", "#");
        temp = temp.toLowerCase();
        temp = temp.replace("#", "A");
        answer = temp;
        return answer;
    }
}