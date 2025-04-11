import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;
        int len = s.length();

        while (idx < len) {
            char x = s.charAt(idx);
            int same = 1; // x 자기 자신 포함
            int notSame = 0;

            for (int i=idx+1; i<len; i++) {
                if (s.charAt(i) == x) same++;
                else notSame++;

                if (same == notSame) {
                    answer++;
                    idx = i + 1;
                    break;
                }

                // 끝까지 갔는데도 same != notSame이면
                if (i == len - 1) {
                    answer++;
                    idx = len;
                }
            }

            // 한 글자만 남은 경우 처리
            if (idx == len - 1) {
                answer++;
                break;
            }
        }

        return answer;
    }
}
