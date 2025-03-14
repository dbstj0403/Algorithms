class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    // √n까지만 검사하여 소수 판별
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true; // 2는 소수
        if (num % 2 == 0) return false; // 짝수는 2를 제외하고 소수가 아님

        for (int i = 3; i * i <= num; i += 2) { // 홀수만 검사 (짝수는 이미 배제)
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
