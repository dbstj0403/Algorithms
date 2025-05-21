import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
        int[] answer = new int[N];
        List<Integer> list = new ArrayList<>();
        Map<Integer, Double> map = new HashMap<>();
        
        int stageNum = 1;
        double fail = 0;
        for(int i = 0; i < N; i++){
            int dojun = 0;
            int notClear = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] >= stageNum){
                    dojun++;
                    if(stages[j] == stageNum){
                        notClear++;
                    }
                }
            }
            if(notClear == 0){
                fail = 0;
            }
            else{
                fail = (double) notClear / dojun;
            }
            map.put(stageNum, fail);
            stageNum++;
        }
        
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(map.entrySet());
        
        entryList.sort((a, b) -> {
            int cmp = Double.compare(b.getValue(), a.getValue()); 
            if (cmp == 0) {
                return Integer.compare(a.getKey(), b.getKey());
            }
            return cmp;
        });

        int i = 0;
        for(Map.Entry<Integer, Double> entry : entryList){
            answer[i] = entry.getKey();
            i++;
        }
        
        return answer;
    }
}