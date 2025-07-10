import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> bridge = new LinkedList<>();
        int time = 0;
        int bridgeWeight = 0;
        int idx = 0;

        while (idx < truck_weights.length || !bridge.isEmpty()) {
            time++;

            // 다리 끝 도달한 트럭 제거
            if (!bridge.isEmpty() && bridge.peek()[1] == time) {
                bridgeWeight -= bridge.poll()[0];
            }

            // 대기 트럭이 있고, 다리 위 무게가 가능하면 트럭 올리기
            if (idx < truck_weights.length) {
                if (bridgeWeight + truck_weights[idx] <= weight) {
                    bridge.offer(new int[]{truck_weights[idx], time + bridge_length});
                    bridgeWeight += truck_weights[idx];
                    idx++;
                }
            }
        }
        return time;
    }
}
