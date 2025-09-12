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
            addEdge(a, b);
        }

        int answer = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            int sum = bfs(i); 
            if (sum < min) {
                min = sum;
                answer = i;
            }
        }

        System.out.println(answer);
    }

    static void addEdge(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }
    
    static int bfs(int start) {
        boolean[] visited = new boolean[N + 1];
        int[] dist = new int[N + 1]; // 각 정점까지 거리
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.offer(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : edges.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[cur] + 1; 
                    q.offer(next);
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += dist[i];
        }
        return sum;
    }
}
