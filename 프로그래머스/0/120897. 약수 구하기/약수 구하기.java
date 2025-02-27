import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        // n의 약수를 오름차순으로 담은 배열 리턴
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        // 리스트를 다시 배열로 변환
        int [] answer = new int [list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}