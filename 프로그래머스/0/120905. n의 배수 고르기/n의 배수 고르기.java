import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // numlist에서 n의 배수가 아닌 수들을 제거한 배열 리턴
        ArrayList<Integer> list = new ArrayList<>(); // 리스트 선언
        
        for(int num : numlist){
            if(num % n == 0){
                list.add(num);
            }
        }
        int [] answer = new int [list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i); 
        }
        
        return answer;
    }
}