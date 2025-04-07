import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int idx = 0; // 현재 위치
        
        while(idx < section.length) {
            int start = section[idx]; // 새로 칠해야 하는 시작 구간
            answer++; // 롤러 횟수 증가
            
            // 롤러로 start ~ start + m - 1 까지 칠함
            idx++; // 다음 구간 확인
            while(idx < section.length && section[idx] < start + m) {
                idx++; // 롤러 범위 안에 들어가면 그냥 넘어감
            }
        }
        
        return answer;
    }
}
