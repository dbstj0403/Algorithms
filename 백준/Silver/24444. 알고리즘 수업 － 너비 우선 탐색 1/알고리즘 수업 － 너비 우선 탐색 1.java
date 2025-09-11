import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();
    static int[] orders;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        Arrays.fill(visited, false);

        orders = new int[N + 1];

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

        bfs(R);

        for(int i = 1; i <= N; i++) {
            System.out.println(orders[i]);
        }
    }

    static void addEdge(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }

    static void bfs(int start) {
        q.add(start);
        visited[start] = true;
        orders[start] = count++;
        while(!q.isEmpty()) {
            int node = q.poll();
            for(int edge : edges.get(node)) {
                if(!visited[edge]) {
                    visited[edge] = true;
                    orders[edge] = count++;
                    q.add(edge);
                }
            }
        }
    }
}
