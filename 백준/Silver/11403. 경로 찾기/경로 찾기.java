import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[][] store;
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static int[][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        store = new int[N][N];
        result = new int[N][N];

        for(int i = 0; i < N; i++) {
            edges.add(new ArrayList<>());
        }

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                store[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(store[i][j] == 1) {
                    addEdge(i, j);
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                Arrays.fill(visited, false);
                if(dfs(i, j)) result[i][j] = 1;
                else result[i][j] = 0;
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addEdge(int a, int b) {
        edges.get(a).add(b);
    }

    static boolean dfs(int start, int end) {
        visited[start] = true;
        for(int edge : edges.get(start)) {
            if(edge == end) return true;
            if(!visited[edge]) {
                if(dfs(edge, end)) return true;
            }
        }
        return false;
    }
}
