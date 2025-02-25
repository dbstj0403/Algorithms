class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // included에서 true인 항들만 더한 값을 리턴
        for(int i=0; i<included.length; i++){
            if(included[i] == true){
                answer += a + d * i;
            }
        }
        return answer;
    }
}