import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        // 첫번째 원소부터 n개 간격으로 저장되어 있는 원소들 담은 리스트 반환
 
        for(int i=0; i<num_list.length; i=i+n){
            list.add(num_list[i]);
        }
        
        int [] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}