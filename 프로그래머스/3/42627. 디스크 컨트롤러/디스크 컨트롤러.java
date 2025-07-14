import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0; // 현재 시간
        int jobIdx = 0; // 아직 대기열에 넣지 않은 작업 인덱스
        int count = 0; // 완료한 작업 수

        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0])); // 요청 시간 기준 정렬

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1])); // 실행 시간 기준 정렬

        while (count < jobs.length) {
            // 현재 시간까지 요청된 모든 작업을 큐에 추가
            while (jobIdx < jobs.length && jobs[jobIdx][0] <= time) {
                pq.add(jobs[jobIdx++]);
            }

            if (pq.isEmpty()) {
                // 대기 중인 작업이 없으면 다음 요청 시간으로 점프
                time = jobs[jobIdx][0];
            } else {
                int[] job = pq.poll();
                time += job[1];
                answer += (time - job[0]); // 작업 요청부터 종료까지 걸린 시간
                count++;
            }
        }

        return answer / jobs.length;
    }
}
