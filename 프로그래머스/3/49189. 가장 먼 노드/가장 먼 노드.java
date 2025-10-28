import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> edges;
    static int[] dist;
    static int N;
    
    public int solution(int n, int[][] edge) {
        N = n;
        edges = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
        }

        // 간선 연결
        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            edges.get(a).add(b);
            edges.get(b).add(a);
        }

        dist = new int[n + 1];
        bfs(1);

        // 최댓값과 개수 구하기
        int maxDist = 0;
        for (int i = 1; i <= n; i++) {
            maxDist = Math.max(maxDist, dist[i]);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == maxDist) count++;
        }

        return count;
    }

    static void bfs(int start) {
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : edges.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }
    }
}
