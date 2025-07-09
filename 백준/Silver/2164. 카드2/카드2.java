import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 카드의 개수

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            deque.offer(i + 1);
        }

        while(deque.size() != 1) {
            deque.poll(); // 가장 위의 요소 제거
            int prev = deque.poll();
            deque.offer(prev);
        }

        System.out.println(deque.poll());
    }
}
