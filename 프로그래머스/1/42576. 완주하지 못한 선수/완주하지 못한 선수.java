import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참가자 이름 개수 기록
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 이름 개수 차감
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // 값이 1인 사람 = 완주하지 못한 사람
        for (String name : map.keySet()) {
            if (map.get(name) != 0) {
                return name;
            }
        }

        return ""; 
    }
}
