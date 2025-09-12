import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        for(int i = 0; i <= N; i++) {
            edges.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            addEdge(a, b);
        }

        for(ArrayList<Integer> edge : edges) {
            Collections.sort(edge);
        }

        dfs(V);

        System.out.println(sb);

        sb.delete(0, sb.length());

        Arrays.fill(visited, false);
        bfs(V);

        System.out.println(sb);

    }

    static void addEdge(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }

    static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        for(int edge : edges.get(start)) {
            if(!visited[edge]) dfs(edge);
        }
    }

    static void bfs(int start) {
        visited[start] = true;
        q.offer(start);
        while(!q.isEmpty()) {
            int cur = q.poll();
            sb.append(cur).append(" ");
            for(int edge : edges.get(cur)) {
                if(!visited[edge]) {
                    visited[edge] = true;
                    q.offer(edge);
                }
            }
        }
    }
}
