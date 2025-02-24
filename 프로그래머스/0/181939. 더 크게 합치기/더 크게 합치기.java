class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // String 형태로 바꾼 a, b
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        
        // 문자열 합치기
        String ab = sa + sb;
        String ba = sb + sa;
        
        // 합친 문자열 비교를 위하여 int 형태로 변환
        int iab = Integer.valueOf(ab);
        int iba = Integer.valueOf(ba);
        
        // 비교 후 answer 값 대입
        if (iab > iba){
            answer = iab;
        }
        else if (iab == iba){
            answer = iab;
        }
        else {
            answer = iba;
        }
        
        return answer;
    }
}