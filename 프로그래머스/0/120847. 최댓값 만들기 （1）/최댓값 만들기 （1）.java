import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 오름차순 정렬
        int last = numbers.length - 1;
        int beforeLast = numbers.length - 2;
        answer = numbers[last] * numbers[beforeLast];
        return answer;
    }
}