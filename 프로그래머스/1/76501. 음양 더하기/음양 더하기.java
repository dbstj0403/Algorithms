class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // 이 정수들의 절댓값을 담은 정수 배열, 정수들의 부호를 담은 불리언 배열
        // true = 양수, false = 음수
        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == true){
                // 양수
                answer += absolutes[i];
            }
            else{
                String str = String.valueOf(absolutes[i]);
                str = "-" + str;
                int k = Integer.valueOf(str);
                answer += k;
            }
        }
        return answer;
    }
}