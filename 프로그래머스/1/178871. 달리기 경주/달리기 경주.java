import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] answer = new String[players.length];

        // 초기 등수 세팅
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
            answer[i] = players[i]; // answer 초기값 설정
        }

        // callings 처리
        for (String call : callings) {
            int idx = map.get(call);     // 현재 등수
            if (idx == 0) continue;      // 1등은 패스

            String frontPlayer = answer[idx - 1]; // 앞 선수 이름

            // 위치 swap
            answer[idx - 1] = call;
            answer[idx] = frontPlayer;

            // map의 등수 업데이트
            map.put(call, idx - 1);
            map.put(frontPlayer, idx);
        }

        return answer;
    }
}
