import java.io.*;
import java.util.*;

public class Main {
    static int[][] maps;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            K = Integer.parseInt(st.nextToken()); // 배추 개수

            maps = new int[N][M];
            visited = new boolean[N][M];

            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                maps[y][x] = 1; 
            }

            int cnt = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(!visited[i][j] && maps[i][j] == 1) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    static void bfs(int row, int col) {
        visited[row][col] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {row, col});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int d = 0; d < 4; d++) {
                int newRow = r + dy[d];
                int newCol = c + dx[d];
                if(newRow >= 0 && newRow < N && newCol >= 0 && newCol < M) {
                    if(!visited[newRow][newCol] && maps[newRow][newCol] == 1) {
                        visited[newRow][newCol] = true;
                        q.add(new int[] {newRow, newCol});
                    }
                }
            }
        }
    }
}
