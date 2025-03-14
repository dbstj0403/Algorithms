import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        // 서로 다른 인덱스의 두 개의 수를 더해서 만들 수 있는 모든 수 반환
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int n = numbers[i] + numbers[j];
                list.add(n);
            }
        }
     
        Collections.sort(list); // 오름차순 정렬
        System.out.println(list);
        
        int num = -1;
        for(int i=0; i<list.size(); i++){
            if(num == list.get(i)){
                continue;
            }
            else{
                answer.add(list.get(i));
                num = list.get(i);
            }
            
        }
        
        int[] ans = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            ans[i] = answer.get(i);
        }
        
        return ans;
    }
}