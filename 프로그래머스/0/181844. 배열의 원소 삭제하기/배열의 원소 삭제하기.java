import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        // arr 원소 중 delete_list 원소를 모두 삭제하고 남은 원소들은 기존의 arr 순서 유지
        // arr의 각 요소가 delete_list에 포함되는지 확인
        for (int i = 0; i < arr.length; i++) {
            boolean shouldDelete = false;  // 삭제 여부 체크
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    shouldDelete = true;  // 삭제 대상이면 플래그 설정
                    break;  // 더 이상 검사할 필요 없음
                }
            }
            // 삭제 대상이 아닌 경우에만 리스트에 추가
            if (!shouldDelete) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}