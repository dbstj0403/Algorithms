class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        // n * n 크기의 이차원 배열 반환
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                if(i == j){
                    answer[i][j] = 1;
                }
                else{
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}