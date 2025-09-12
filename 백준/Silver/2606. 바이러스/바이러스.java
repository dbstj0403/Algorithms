import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int m = Integer.parseInt(br.readLine()); // 연결된 쌍의 수

        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            edges.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            addEdge(a, b);
        }

        dfs(1);
        System.out.println(count);
    }

    static void addEdge(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }

    static void dfs(int start) {
        visited[start] = true;
        for (int edge : edges.get(start)) {
            if (!visited[edge]) {
                count++;
                dfs(edge);
            }
        }
    }
}
