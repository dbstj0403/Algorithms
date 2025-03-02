import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // 앞에서부터 순서대로 담은 배열 리턴
        ArrayList<String> list = new ArrayList<>();
        // 공백을 기준으로 단어를 떼자
        String[] answer = my_string.trim().split("\\s+"); // 앞뒤 공백을 뺴야 하므로 trim
        System.out.print(answer);
        return answer;
    }
}