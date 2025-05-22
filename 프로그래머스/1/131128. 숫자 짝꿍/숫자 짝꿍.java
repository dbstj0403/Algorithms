import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> xMap = new HashMap<>();
        Map<Character, Integer> yMap = new HashMap<>();
        List<Character> commonList = new ArrayList<>();

        // X의 숫자 개수 카운팅
        for (char c : X.toCharArray()) {
            xMap.put(c, xMap.getOrDefault(c, 0) + 1);
        }

        // Y의 숫자 개수 카운팅
        for (char c : Y.toCharArray()) {
            yMap.put(c, yMap.getOrDefault(c, 0) + 1);
        }

        // 공통 숫자 리스트 생성
        for (char digit = '0'; digit <= '9'; digit++) {
            if (xMap.containsKey(digit) && yMap.containsKey(digit)) {
                int count = Math.min(xMap.get(digit), yMap.get(digit));
                for (int i = 0; i < count; i++) {
                    commonList.add(digit);
                }
            }
        }

        // 내림차순 정렬
        commonList.sort(Comparator.reverseOrder());

        // 공통 숫자 없음
        if (commonList.isEmpty()) return "-1";

        // 모두 0이면 "0" 반환
        if (commonList.get(0) == '0') return "0";

        // 결과 조합
        StringBuilder sb = new StringBuilder();
        for (char c : commonList) {
            sb.append(c);
        }

        return sb.toString();
    }
}
