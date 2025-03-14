import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // 배열 슬라이싱 (1-based index → 0-based index 변환)
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

            // 정렬
            Arrays.sort(arr);

            // k번째 원소 선택 (1-based index → 0-based index 변환)
            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }
}
