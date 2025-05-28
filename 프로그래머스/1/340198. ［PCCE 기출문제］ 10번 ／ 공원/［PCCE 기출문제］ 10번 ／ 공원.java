import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 오름차순 정렬
        Arrays.sort(mats);
        int w = park.length;
        int h = park[0].length;
        
        // 큰 매트 순으로 시작
        for(int i = mats.length - 1; i >= 0; i--){
            int size = mats[i];
            for(int j = 0; j <= w - size; j++){
                for(int k = 0; k <= h - size; k++){
                    if(canPlace(park, j, k, size)){
                        return size;
                    }
                }
            }
        }
        
        return -1;
    }
    
    private boolean canPlace(String[][] park, int startRow, int startCol, int size){
        for(int i = startRow; i < startRow + size; i++){
            for(int j = startCol; j < startCol + size; j++){
                if(!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        
        return true;
    }
}