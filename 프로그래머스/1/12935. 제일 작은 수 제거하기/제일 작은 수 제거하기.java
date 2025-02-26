import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 배열 길이가 1인 경우
        if(arr.length <= 1){
            int [] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length - 1];
        int[] temp = Arrays.copyOf(arr, arr.length);
        // 배열 arr 에서 가장 작은 수 제거
        // 빈 배열인 경우 배열에 -1 넣어서 반환
        Arrays.sort(arr); 
        
        // arr = [1, 2, 3, 4] temp = [4, 3, 2, 1]
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(temp[i] == arr[0]){
                continue;
            }
            answer[j] = temp[i];
            j++;
        }
        
        return answer;
    }
}