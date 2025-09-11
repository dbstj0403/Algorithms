import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static int[] order;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        visited = new boolean[N + 1];
        order = new int[N + 1];

        // 간선 리스트 초기화
        for (int i = 0; i <= N; i++) {
            edges.add(new ArrayList<>());
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges.get(a).add(b);
            edges.get(b).add(a);
        }

        // 각 정점 인접 리스트 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(edges.get(i));
        }

        // DFS 실행
        dfs(R);

        // 방문 순서 출력
        for (int i = 1; i <= N; i++) {
            System.out.println(order[i]); // 방문 못 했으면 기본값 0
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        order[start] = cnt++;

        for (int next : edges.get(start)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
