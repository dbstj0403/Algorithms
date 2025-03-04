import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        // n번째 원소 이후의 원소들과 n번째까지의 원소들로 나눠 바꿔 붙이기
        int[] sliced1 = Arrays.copyOfRange(num_list, 0, n); // 앞의 배열 슬라이싱
        int[] sliced2 = Arrays.copyOfRange(num_list, n, num_list.length); // 뒤의 배열 슬라이싱  
        for(int i=0; i<sliced2.length; i++){
            answer[i] = sliced2[i];
        }
        
        int k = sliced2.length;
        for(int j=0; j<sliced1.length; j++){
            answer[k] = sliced1[j];
            k++;
        }
       
        return answer;
    }
}