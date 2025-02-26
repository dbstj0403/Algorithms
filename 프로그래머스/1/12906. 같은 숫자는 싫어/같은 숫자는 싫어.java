import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> stack = new ArrayList(); // 리스트 선언
        // 배열에서 연속적으로 나타나는 숫자 중복 제거 후 순서 유지한 채로 반환
        int pivot = arr[0];
        stack.add(pivot); // 첫번째 요소 넣기
        for(int i : arr){
           if(i == pivot){
               continue;
           }
           pivot = i;
           stack.add(pivot);
        }
      
        int [] answer = new int [stack.size()]; // stack 리스트 크기만큼 생성
        for(int i=0; i<stack.size(); i++){ // 리스트 크기 -> .size()
            answer[i] = stack.get(i); // 요소 가져올 땐 get 메서드 사용
        }
        return answer;
    }
}