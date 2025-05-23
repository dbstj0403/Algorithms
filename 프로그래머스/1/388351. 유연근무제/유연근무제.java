class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < timelogs.length; i++) {
            boolean passed = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1; // 1~7 요일 계산

                if (day == 6 || day == 7) continue; // 주말 스킵

                int scheduled = schedules[i];
                int log = timelogs[i][j];

                // 시/분으로 변환 후 10분 더함
                int hour = scheduled / 100;
                int minute = scheduled % 100 + 10;
                if (minute >= 60) {
                    hour += 1;
                    minute -= 60;
                }
                int allowed = hour * 100 + minute;

                if (log > allowed) {
                    passed = false;
                    break;
                }
            }

            if (passed) answer++;
        }

        return answer;
    }
}
