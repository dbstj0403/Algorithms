class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        // 'Kim'의 위치 x를 찾아 string 반환
        for(int i=0; i<seoul.length; i++){
            String str = seoul[i];
            if(str.equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}