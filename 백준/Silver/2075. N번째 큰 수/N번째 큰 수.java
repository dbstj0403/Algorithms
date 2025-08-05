import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int x = Integer.parseInt(st.nextToken());
                pq.offer(x);
            }
        }

        for(int i = 0; i < N - 1; i++) {
            pq.poll();
        }

        System.out.println(pq.poll());
    }
}
