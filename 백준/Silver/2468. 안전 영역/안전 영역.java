import java.io.*;
import java.util.*;

public class Main {
    static int[][] maps;
    static boolean[][] visited;
    static int N;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        maps = new int[N][N];

        int maxH = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
                maxH = Math.max(maxH, maps[i][j]);
            }
        }

        int answer = 0;
        // 비의 양 h: 0 ~ 최대 높이
        for (int h = 0; h <= maxH; h++) {
            visited = new boolean[N][N];
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 잠기지 않았고 아직 방문 X면 새로운 안전영역
                    if (!visited[i][j] && maps[i][j] > h) {
                        bfs(i, j, h);
                        cnt++;
                    }
                }
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }

    static void bfs(int si, int sj, int h) {
        Queue<int[]> q = new LinkedList<>();
        visited[si][sj] = true;
        q.add(new int[]{si, sj});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int k = 0; k < 4; k++) {
                int ni = cur[0] + dx[k];
                int nj = cur[1] + dy[k];
                if (0 <= ni && ni < N && 0 <= nj && nj < N) {
                    if (!visited[ni][nj] && maps[ni][nj] > h) { // 잠기지 않은 칸만 확장
                        visited[ni][nj] = true;
                        q.add(new int[]{ni, nj});
                    }
                }
            }
        }
    }
}
