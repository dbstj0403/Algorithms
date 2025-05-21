import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 1부터 45까지의 숫자 중 6개 선택
        // 알아볼 수 없는 숫자 0
        // 0이 아닌 숫자는 2개 이상 담겨있지 않음
        int[] answer = new int[2];
        
        // 등수 매치용 해시맵 (키, 값 쌍으로 저장할 땐 해시맵, 값만은 해시셋)
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 1);
        map.put(5, 2);
        map.put(4, 3);
        map.put(3, 4);
        map.put(2, 5);
        map.put(1, 6);
        map.put(0, 6);
        
        Set<Integer> winSet = new HashSet<>();
        for(int n : win_nums){
            winSet.add(n);
        }
        
        List<Integer> isExist_list = new ArrayList<>();
        int count = 0;
        int zeroCount = 0;
        
        for(int i = 0; i < lottos.length; i++){
            if(winSet.contains(lottos[i])){
                isExist_list.add(lottos[i]);
                count++;
            }
            else if(lottos[i] == 0){
                zeroCount++;
            }
        }
        int n = win_nums.length - isExist_list.size();
        
        answer[1] = map.get(count);
        if(n >= zeroCount){
            count += zeroCount;
        }
        else{
            count += n;
        }
        answer[0] = map.get(count);
        
        return answer;
    }
}