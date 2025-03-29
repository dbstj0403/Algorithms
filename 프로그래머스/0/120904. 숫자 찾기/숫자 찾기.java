class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int len = String.valueOf(num).length();
        // num을 이루는 숫자 중에 k가 있으면 그 인덱스 반환
        String str = String.valueOf(num); // 문자열로 변환
        char c = (char) (k + '0');
        for(int i=0; i<len; i++){
            char p = str.charAt(i);
            if(c == p){
                answer = i + 1;
                return answer;
            }
        }
        return -1;
    }
}