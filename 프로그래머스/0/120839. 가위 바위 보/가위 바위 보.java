class Solution {
    public String solution(String rsp) {
        String answer = "";
        // 가위는 2 바위는 0 보는 5
        for(int i=0; i<rsp.length(); i++){
            char c = rsp.charAt(i);
            if(c == '2'){
                answer += "0";
            }
            else if(c == '0'){
                answer += "5";
            }
            else{
                answer += "2";
            }
            
        }
        return answer;
    }
}