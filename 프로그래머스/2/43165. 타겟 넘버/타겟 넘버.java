class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    private void dfs(int[] numbers, int target, int idx, int sum) {
        // 모든 숫자를 다 사용했을 때
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        // 현재 숫자를 +로 사용
        dfs(numbers, target, idx + 1, sum + numbers[idx]);
        // 현재 숫자를 -로 사용
        dfs(numbers, target, idx + 1, sum - numbers[idx]);
    }
}
