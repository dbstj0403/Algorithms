import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값 리턴
        // 음수 두 개를 곱해서 최댓값이 되는 걸 고려해야 함!
        for(int i=0; i<numbers.length - 1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] * numbers[j] > answer){
                      answer = numbers[i] * numbers[j];
                }
            }
            System.out.print(answer);
        }
        return answer;
    }
}