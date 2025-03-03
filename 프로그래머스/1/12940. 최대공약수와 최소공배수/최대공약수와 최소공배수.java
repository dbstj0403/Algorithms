class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 최대공약수 구하기
        int max = Math.max(n, m);
        int gcd = 0;
        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                k = i;
            }
        }
        answer[0] = gcd;

        // 최소공배수 구하기
        int mul = n * m;
        int lcm = mul;
        for (int i = 1; i <= mul; i++) {
            if (i % n == 0 && i % m == 0) {
                lcm = i;
                break;
            }
        }
        answer[1] = lcm;

        return answer;
    }
}
