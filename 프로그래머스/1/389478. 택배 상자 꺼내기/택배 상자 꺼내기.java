class Solution {
    public int solution(int n, int w, int num) {
        // 상자 위치 구하기
        int row = (num - 1) / w;
        int col;
        
        if(row % 2 == 0){
            col = (num - 1) % w;
        }
        else{
            col = w - 1 - (num - 1) % w;
        }
        
        // 위에 있는 상자 개수 세기
        int count = 0;
        for(int r = row + 1; r <= (n - 1) / w; r++){
            int index;
            if(r % 2 == 0){
                index = r * w + col + 1;
            }
            else{
                index = r * w + (w - 1 - col) + 1;
            }
            
            if(index <= n) count++;
        }
        
        return count + 1;
    }
}