import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int M = Integer.parseInt(br.readLine());
            System.out.println(M / 2 + 1);  // 중앙값 개수 출력

            int count = 0;  // 중앙값 출력 개수
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for (int j = 0; j < M; j++) {
                if (j % 10 == 0) st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());

                if (maxHeap.size() == minHeap.size()) {
                    maxHeap.offer(n);
                } else {
                    minHeap.offer(n);
                }

                // 힙 정렬 유지
                if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                    int a = maxHeap.poll();
                    int b = minHeap.poll();
                    maxHeap.offer(b);
                    minHeap.offer(a);
                }

                if (j % 2 == 0) {
                    System.out.print(maxHeap.peek() + " ");
                    count++;
                    if (count % 10 == 0) System.out.println();  // 10개마다 줄바꿈
                }
            }

            System.out.println(); // 각 테스트케이스 종료 후 개행
        }
    }
}
