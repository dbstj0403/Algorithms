class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] PE = new int[n];
        
        // 전체를 1로 초기화
        for (int i = 0; i < n; i++) {
            PE[i] = 1;
        }

        // 잃어버린 사람 -1
        for (int l : lost) {
            PE[l - 1]--;
        }

        // 여벌 체육복 가진 사람 +1
        for (int r : reserve) {
            PE[r - 1]++;
        }

        // 체육복 빌려주기
        for (int i = 0; i < n; i++) {
            if (PE[i] == 0) {
                if (i > 0 && PE[i - 1] == 2) {
                    PE[i - 1]--;
                    PE[i]++;
                } else if (i < n - 1 && PE[i + 1] == 2) {
                    PE[i + 1]--;
                    PE[i]++;
                }
            }
        }

        // 체육 수업 가능한 학생 수 계산
        int answer = 0;
        for (int p : PE) {
            if (p >= 1) answer++;
        }

        return answer;
    }
}
