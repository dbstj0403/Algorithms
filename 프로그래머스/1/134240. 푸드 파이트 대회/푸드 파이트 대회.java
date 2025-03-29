import java.util.*;

class Solution {
    public String solution(int[] food) {
        // 양쪽에서 음식을 먹기 시작하는데, 가운데 있는 물을 먼저 먹는 선수 승리
        StringBuilder sb = new StringBuilder("");
        // 음식은 2로 나눈 수만큼 배치가 가능함
        for(int i=1; i<food.length; i++){
            for(int j=1; j<=food[i]/2; j++){
                  sb.append(i);
            }
        }
        StringBuilder reverse = new StringBuilder(sb.toString());
        reverse = reverse.reverse();
        sb.append("0");
        sb.append(reverse);
        return sb.toString();
    }
}