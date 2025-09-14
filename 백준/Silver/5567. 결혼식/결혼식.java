import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;

       int n = Integer.parseInt(br.readLine());
       int m = Integer.parseInt(br.readLine());

       visited = new boolean[n + 1];
       dist = new int[n + 1];

       for(int i = 0; i <= n; i++) {
           edges.add(new ArrayList<>());
       }

       for(int i = 0; i < m; i++) {
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           addEdge(a, b);
       }

       bfs(1);

       int cnt = 0;

       for(int i = 1; i <= n; i++) {
           if(dist[i] >= 1 && dist[i] <= 2) cnt++;
       }

       System.out.println(cnt);
    }

    static void addEdge(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }

    static void bfs(int start) {
        visited[start] = true;
        dist[start] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int edge : edges.get(cur)) {
                if(!visited[edge]) {
                    visited[edge] = true;
                    dist[edge] = dist[cur] + 1;
                    q.add(edge);
                }
            }
        }
    }
}
