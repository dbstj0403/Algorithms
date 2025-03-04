import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // Integer.toString(str, 3) 이 방식으로도 10진수 -> 3진수 변환 가능
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        answer = Integer.parseInt(sb.toString(), 3);

        return answer;
    }
}
