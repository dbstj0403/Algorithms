import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 최소 힙
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int food : scoville){
            minHeap.add(food);
        }
        
        while(minHeap.size() >= 2){
            int a = minHeap.poll();
            int b = minHeap.poll();
            
            if(a >= K){
                return answer;
            }
        
            answer++;
            minHeap.add(a + b * 2);
            
            if(minHeap.peek() >= K){
                return answer;
            }

        }
        
        if(minHeap.poll() < K){
            return -1;
        }
        
        return answer;
    }
}