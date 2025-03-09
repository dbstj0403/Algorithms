import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {num_list.length - 5};
        // 리스트에서 가장 작은 5개의 수를 제외한 수를 오름차순으로 담은 리스트 반환
        Arrays.sort(num_list); // 오름차순 정렬
        answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        return answer;
    }
}