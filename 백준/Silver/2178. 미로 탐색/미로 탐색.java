import java.io.*;
import java.util.*;

public class Main {
    static int[][] maps;
    static int[][] dist;  
    static int[] dx = {-1, 1, 0, 0}; 
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 행
        M = Integer.parseInt(st.nextToken()); // 열

        maps = new int[N][M];
        dist = new int[N][M];

        // 미로 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maps[i][j] = line.charAt(j) - '0';
            }
        }

        // BFS 실행
        bfs(0, 0);

        // 도착지 최단거리 출력
        System.out.println(dist[N-1][M-1]);
    }

    static void bfs(int startX, int startY) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});
        dist[startX][startY] = 1; // 시작점 거리 1

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (maps[nx][ny] == 1 && dist[nx][ny] == 0) {
                        dist[nx][ny] = dist[x][y] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
