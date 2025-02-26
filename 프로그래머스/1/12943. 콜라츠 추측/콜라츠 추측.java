class Solution {
    public int solution(long num) {
        int count = 0;

        while (count < 500) { // ✅ 500회 미만 반복
            if (num == 1) { // num이 1이면 반복 중지
                return count;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            count++; // 작업 후 카운트 증가
        }

        return -1; // ✅ 500번 반복했는데도 1이 아니면 -1 반환
    }
}
