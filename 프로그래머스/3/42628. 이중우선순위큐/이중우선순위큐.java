import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String operation : operations) {
            String[] op = operation.split(" ");
            if (op[0].equals("I")) {
                int num = Integer.parseInt(op[1]);
                minHeap.add(num);
                maxHeap.add(num);
            } else {
                if (minHeap.isEmpty() || maxHeap.isEmpty()) {
                    continue;
                }
                if (op[1].equals("1")) {
                    // 최댓값 삭제
                    int max = maxHeap.poll();
                    minHeap.remove(max); // 동기화
                } else {
                    // 최솟값 삭제
                    int min = minHeap.poll();
                    maxHeap.remove(min); // 동기화
                }
            }
        }

        if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }

        return answer;
    }
}
