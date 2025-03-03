class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // myString에 pat 존재하면 1, 아니면 0
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}