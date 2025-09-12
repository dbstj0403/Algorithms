import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            edges.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a가 b를 신뢰 → b가 해킹되면 a도 해킹됨
            // 따라서 b → a 방향으로 저장
            edges.get(b).add(a);
        }

        int[] counts = new int[N + 1];
        int max = 0;

        for (int i = 1; i <= N; i++) {
            counts[i] = bfs(i);
            max = Math.max(max, counts[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (counts[i] == max) sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    static int bfs(int start) {
        int cnt = 1; // 자기 자신 포함
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : edges.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    cnt++;
                    q.add(next);
                }
            }
        }
        return cnt;
    }
}
