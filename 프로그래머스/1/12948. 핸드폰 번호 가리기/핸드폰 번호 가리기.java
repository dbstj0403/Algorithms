class Solution {
    public String solution(String phone_number) {
        String answer = "";
        // 뒷자리 4자를 제외한 나머지 숫자 모두 모자이크
        int n = phone_number.length();
        for(int i=0; i<=n - 5; i++){
            answer += "*";
        }
        String sliced = phone_number.substring(n - 4, n);
        answer += sliced;
        
        return answer;
    }
}