import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수
        int[] answer = new int[photo.length];
        // 해시맵을 사용해 보자...!
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                sum += map.getOrDefault(photo[i][j], 0);
            }
            answer[i] = sum;
        }
        return answer;
    }
}