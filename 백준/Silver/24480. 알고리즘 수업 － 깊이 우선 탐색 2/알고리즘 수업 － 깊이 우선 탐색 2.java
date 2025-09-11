import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static int[] orders;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++) {
            edges.add(new ArrayList<>());
        }

        visited = new boolean[N + 1];
        orders = new int[N + 1];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            addEdges(a, b);
        }

        for(ArrayList<Integer> edge : edges) {
            Collections.sort(edge, Collections.reverseOrder());
        }

        dfs(R);

        for(int i = 1; i <= N; i++) {
            System.out.println(orders[i]);
        }

    }

    static void addEdges(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }

    static void dfs(int start) {
        visited[start] = true;
        orders[start] = count++;
        for(int edge : edges.get(start)) {
            if(!visited[edge]) dfs(edge);
        }
    }
}
