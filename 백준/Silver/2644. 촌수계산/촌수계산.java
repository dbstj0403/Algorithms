import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        dist = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            addEdge(x, y);
        }

        bfs(start, end);

        if(visited[end]) System.out.println(dist[end]);
        else System.out.println(-1);
    }

    static void addEdge(int a, int b) {
        edges.get(b).add(a);
        edges.get(a).add(b);
    }

    static void bfs(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        dist[start] = 0;
        q.offer(start);
        while(!q.isEmpty()) {
            int cur = q.poll();
            if(cur == end) break;
            for(int edge : edges.get(cur)) {
                if(!visited[edge]) {
                    visited[edge] = true;
                    dist[edge] = dist[cur] + 1;
                    q.offer(edge);
                }
            }
        }
    }
}
