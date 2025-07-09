import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayDeque<Integer> progressDeque = new ArrayDeque<>();
        ArrayDeque<Integer> speedDeque = new ArrayDeque<>();
        
        for(int progress : progresses){
            progressDeque.offer(progress);
        }
        
        for(int speed : speeds){
            speedDeque.offer(speed);
        }
        
        while(!progressDeque.isEmpty()){
            // 하루치 진도 업데이트
            int size = progressDeque.size();
            for(int i = 0; i < size; i++) {
                int p = progressDeque.poll();
                int s = speedDeque.poll();
                progressDeque.offer(p + s);
                speedDeque.offer(s);
            }
            
            int count = 0;
            
            // 앞에서부터 연속적으로 100 이상인 기능들 배포
            while(!progressDeque.isEmpty() && progressDeque.peek() >= 100){
                progressDeque.poll();
                speedDeque.poll();
                count++;
            }
            
            if(count > 0) { // 배포된 기능이 있으면 기록
                arr.add(count);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}
