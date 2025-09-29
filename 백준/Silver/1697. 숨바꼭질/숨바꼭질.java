import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int N;
    static int K;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 수빈이 위치
        K = Integer.parseInt(st.nextToken()); // 동생 위치

        visited = new boolean[100001]; 
        dist = new int[100001];

        bfs(N);

        System.out.println(dist[K]); // K까지의 최소 시간 출력
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == K) return; // 동생 위치 도달하면 종료

            int[] nextPos = {now - 1, now + 1, now * 2};

            for (int next : nextPos) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[now] + 1;
                    q.offer(next);
                }
            }
        }
    }
}
