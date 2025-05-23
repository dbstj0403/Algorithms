import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // flag[i] true -> X 뒤에 arr[i] 2번 추가
        // flag[i] false -> X 마지막 arr[i] 개 원소 제거 후 리턴
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for (int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            }
            else{
                for(int j = 0; j < arr[i]; j++){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
            }
        }
        
        // Stack -> int[] 변환
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}