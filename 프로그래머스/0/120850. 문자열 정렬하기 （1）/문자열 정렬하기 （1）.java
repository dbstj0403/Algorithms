import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();

        // 문자열에서 숫자만 골라 리스트에 추가
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                list.add(Character.getNumericValue(c)); // char → int 변환 후 추가
            }
        }

        // 리스트를 오름차순 정렬
        Collections.sort(list);

        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
