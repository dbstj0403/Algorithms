import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0, 0, 0, 0};
        // 가장 작은 5개의 수를 오름차순으로 담은 리스트 리턴
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : num_list){
            list.add(i);
        }
        list.sort(null); // 오름차순 정렬 리스트 정렬시 안에 인자 넣어야 함!
        // 리스트를 다시 배열로 변환하는데, 5개만 넣기
        for(int i=0; i<5; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}