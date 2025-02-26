import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        // divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열 반환
        for(int i : arr){
            if(i % divisor == 0){
                count++;
            }
        }
        
        if(count == 0){
            int [] answer = {-1};
            return answer;
        }
        int j = 0;
        int[] answer = new int[count];
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[j] = arr[i];
                j++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}