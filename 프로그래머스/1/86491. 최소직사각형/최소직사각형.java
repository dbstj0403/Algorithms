class Solution {
    public int solution(int[][] sizes) {
        // 먼저 가로가 세로보다 길도록 2차원 배열을 수정하자
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp; 
            }
        } 
        
        // 가로, 세로 가장 큰 값 뽑기
        int garo = sizes[0][0];
        int sero = sizes[0][1];
        for(int i=1; i<sizes.length; i++){
            if(sizes[i][0] > garo){
                garo = sizes[i][0];
            }
            if(sizes[i][1] > sero){
                sero = sizes[i][1];
            }
        }
        return garo * sero;
    }
}