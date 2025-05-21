import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] canSay = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            String temp = word;

            // 연속된 동일 발음이 있는지 먼저 검사
            if (temp.contains("ayaaya") || temp.contains("yeye") || 
                temp.contains("woowoo") || temp.contains("mama")) {
                continue;
            }

            // 가능한 발음 제거
            for (String s : canSay) {
                temp = temp.replace(s, " ");
            }

            // 모두 제거됐으면 (공백만 남았다면) 발음 가능
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
