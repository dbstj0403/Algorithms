class Solution {
    public int solution(int[][] dots) {
        // 주어진 네 개의 점을 두 개씩 이었을 때, 평행이 되는 경우가 있으면 1 없으면 0
        int answer = 0;
        
        if(getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])){
            return 1;
        }
        
        if(getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])){
            return 1;
        }
        
        if(getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])){
            return 1;
        }
        
        return answer;
    }
    
    private double getSlope(int p1[], int p2[]) {
            double dx = (double) p2[0] - p1[0];
            double dy = (double) p2[1] - p1[1];
            return (double) dy / dx;
        }
}