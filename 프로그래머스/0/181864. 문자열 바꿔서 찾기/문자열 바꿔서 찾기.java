class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = "";
        // 문자 A, B로 이루어진 문자열 myString, pat
        temp = myString.replace("A", "#"); 
        temp = temp.replace("B", "A");
        temp = temp.replace("#", "B");
        myString = temp;
        if(myString.contains(pat)){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}