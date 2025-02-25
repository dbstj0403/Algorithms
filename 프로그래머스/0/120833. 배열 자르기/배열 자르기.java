import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        // 정수 배열 numbers, num1 인덱스부터 num2 인덱스까지 자른 배열 반환하기
        // JAVA에서는 Arrays.copyOfRange(arr, index, index)로 배열 슬라이싱 진행
        // java.util.Arrays import 필요!
        int[] sliced = Arrays.copyOfRange(numbers, num1, num2 + 1);
        answer = sliced;
        return answer;
    }
}