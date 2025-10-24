import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[][];
    static int maps[][];
    static ArrayList<Integer> list = new ArrayList<>();
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int M, N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 세로
        N = Integer.parseInt(st.nextToken()); // 가로
        K = Integer.parseInt(st.nextToken()); // 직사각형 개수

        visited = new boolean[M][N];
        maps = new int[M][N];

        while(K --> 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int y = M - y2; y < M - y1; y++) {
                for(int x = x1; x < x2; x++) {
                    maps[y][x] = 1;
                }
            }
        }

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(maps[i][j] == 0 && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int item : list) {
            System.out.print(item + " ");
        }
    }

    static void bfs(int i, int j) {
        int count = 1;
        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            for(int k = 0; k < 4; k++) {
                int new_row = cur[0] + dy[k];
                int new_col = cur[1] + dx[k];
                if(new_row < M && new_row >= 0 && new_col < N && new_col >= 0) {
                    if(!visited[new_row][new_col] && maps[new_row][new_col] == 0) {
                        visited[new_row][new_col] = true;
                        count++;
                        q.add(new int[]{new_row, new_col});
                    }
                }
            }
        }

        list.add(count);
    }
}
