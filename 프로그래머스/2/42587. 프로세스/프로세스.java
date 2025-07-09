import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>(); // 실행 순서 담기
        ArrayDeque<Integer> wait = new ArrayDeque<>(); // 대기 중인 프로세스 (0, 1, 2, 3, ...)
        ArrayDeque<Integer> priority = new ArrayDeque<>(); // 우선순위
        
        for(int i = 0; i < priorities.length; i++){
            wait.offer(i);
        }
        
        for(int prr : priorities){
            priority.offer(prr);
        }
        
        while(!wait.isEmpty()){
            int w = wait.poll();
            int p = priority.poll();
            boolean flag = true;
            
            for(int pr : priority){
                if(p < pr){
                    wait.offer(w);
                    priority.offer(p);
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                System.out.println(w);
                list.add(w);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            if(location == list.get(i)){
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}