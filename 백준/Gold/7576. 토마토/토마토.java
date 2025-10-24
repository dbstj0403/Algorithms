import java.io.*;
import java.util.*;

public class Main {
    static int[][] maps;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int N;
    static int M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        maps = new int[N][M];

        Queue<int[]> queue = new LinkedList<>();

        boolean already = true;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int n = Integer.parseInt(st.nextToken());
                if(n == 0) already = false;
                maps[i][j] = n;
            }
        }

        if(already) System.out.println(0);
        else {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(maps[i][j] == 1) {
                        queue.add(new int[] {i, j});
                    }
                }
            }

            while(!queue.isEmpty()) {
                int[] cur = queue.poll();
                for(int k = 0; k < 4; k++) {
                    int x = cur[0] + dx[k];
                    int y = cur[1] + dy[k];
                    if(x >= 0 && x < N && y >= 0 && y < M) {
                        if(maps[x][y] == 0) {
                            maps[x][y] = maps[cur[0]][cur[1]] + 1;
                            queue.add(new int[] {x, y});
                        }
                    }
                }
            }

            int max = 0;
            boolean hasZero = false;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (maps[i][j] == 0) {   // 아직 안 익은 토마토가 남았으면
                        hasZero = true;
                        break;               // 안쪽 루프 탈출
                    }
                    max = Math.max(max, maps[i][j]);
                }
                if (hasZero) break;          // 바깥 루프도 함께 탈출
            }

            if (hasZero) {
                System.out.println(-1);
            } else {
                System.out.println(max - 1); // 처음 익은 토마토가 1이므로 날짜는 -1
            }
        }
    }
}
