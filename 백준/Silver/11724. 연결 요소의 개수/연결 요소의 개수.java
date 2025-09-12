import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++) {
            edges.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            addEdge(a, b);
        }

        visited = new boolean[N + 1];

        int components = 0;
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
                components++;
            }
        }

        System.out.println(components);

    }

    static void addEdge(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }

    static void dfs(int start) {
        visited[start] = true;
        for(int edge : edges.get(start)) {
            if(!visited[edge]) dfs(edge);
        }
    }
}
