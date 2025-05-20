import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // data에서 ext 값이 val_ext보다 작은 데이터만 뽑고, sort_by에 해당하는 값을 기준으로 오름차순 정렬
       
        Map<String, Integer> columnIndex = new HashMap<>();
        columnIndex.put("code", 0);
        columnIndex.put("date", 1);
        columnIndex.put("maximum", 2);
        columnIndex.put("remain", 3);
        
        int extIndex = columnIndex.get(ext);
        int sortIndex = columnIndex.get(sort_by);
        
        List<int[]> list = new ArrayList<>();
        for(int[] row : data){
            if(row[extIndex] < val_ext){
                list.add(row);
            }
        }
        
        list.sort(Comparator.comparingInt(a -> a[sortIndex]));
        
        int[][] answer = new int[list.size()][];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}