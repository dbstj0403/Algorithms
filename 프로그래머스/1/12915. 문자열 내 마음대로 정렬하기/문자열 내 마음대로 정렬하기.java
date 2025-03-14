import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        // 1. strings를 사전순으로 정렬
        Arrays.sort(strings);

        // 2. n번째 문자를 저장할 배열 생성
        Character[] arr = new Character[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = strings[i].charAt(n);
        }

        // 3. n번째 문자 배열을 정렬
        Arrays.sort(arr);

        // 4. 정렬된 문자 배열을 기반으로 strings에서 일치하는 요소를 찾아 answer에 저장
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).charAt(n) == arr[i]) {
                    answer[i] = list.get(j);
                    list.remove(j); // 요소 제거하여 중복 방지
                    break; // 이미 매칭된 요소는 더 이상 확인할 필요 없음
                }
            }
        }

        return answer;
    }
}
