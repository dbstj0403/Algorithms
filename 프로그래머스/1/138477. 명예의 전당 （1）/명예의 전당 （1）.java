import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬

            if (list.size() > k) {
                list.remove(list.size() - 1); // 가장 낮은 점수 제거
            }

            answer[i] = list.get(list.size() - 1); // 현재 명예의 전당 중 가장 낮은 점수
        }

        return answer;
    }
}
