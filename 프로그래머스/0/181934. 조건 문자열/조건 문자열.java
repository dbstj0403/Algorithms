class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        // ineq가 "<"일 경우
        if(ineq.equals("<")){
            // eq가 "="일 경우
            if(eq.equals("=")){
                if(n <= m){
                    answer = 1;
                }
                else{
                    answer = 0;
                }
            }
            // eq가 "!"일 경우
            else{
                if(n < m){
                    answer = 1;
                }
                else{
                    answer = 0;
                }
            }
        }
        else{
            // eq가 "="일 경우
            if(eq.equals("=")){
                if(n >= m){
                    answer = 1;
                }
                else{
                    answer = 0;
                }
            }
            // eq가 "!"일 경우
            else{
                if(n > m){
                    answer = 1;
                }
                else{
                    answer = 0;
                }
            }
        }
        return answer;
    }
}