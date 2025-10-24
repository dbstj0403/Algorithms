import java.io.*;
import java.util.*;

public class Main {
    static int M, N, H;
    static int[][][] boxes;             // [h][n][m] = 높이/세로/가로
    static int[] dr = {0, 0, 1, -1};    // 세로(아래/위)
    static int[] dc = {1, -1, 0, 0};    // 가로(오른쪽/왼쪽)
    static int[] dh = {1, -1};          // 위/아래 층

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로
        H = Integer.parseInt(st.nextToken()); // 높이

        boxes = new int[H][N][M];

        boolean already = true;
        // 입력: 층(h) -> 행(n) -> 열(m)
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < M; c++) {
                    int v = Integer.parseInt(st.nextToken());
                    boxes[h][r][c] = v;
                    if (v == 0) already = false;
                }
            }
        }

        if (already) {
            System.out.println(0);
            return;
        }

        Queue<int[]> q = new LinkedList<>();
        // 다중 시작점: 모든 익은 토마토(1) 삽입
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (boxes[h][r][c] == 1) q.add(new int[]{h, r, c});
                }
            }
        }

        // BFS
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int ch = cur[0], cr = cur[1], cc = cur[2];

            // 같은 층에서 4방향
            for (int k = 0; k < 4; k++) {
                int nr = cr + dr[k];
                int nc = cc + dc[k];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                    if (boxes[ch][nr][nc] == 0) {
                        boxes[ch][nr][nc] = boxes[ch][cr][cc] + 1;
                        q.add(new int[]{ch, nr, nc});
                    }
                }
            }

            // 위/아래 층
            for (int k = 0; k < 2; k++) {
                int nh = ch + dh[k];
                if (nh >= 0 && nh < H) {
                    if (boxes[nh][cr][cc] == 0) {
                        boxes[nh][cr][cc] = boxes[ch][cr][cc] + 1;
                        q.add(new int[]{nh, cr, cc});
                    }
                }
            }
        }

        // 결과 계산
        int max = 0;
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (boxes[h][r][c] == 0) { // 아직 안 익은 게 남아있음
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, boxes[h][r][c]);
                }
            }
        }
        System.out.println(max - 1); // 날짜 보정
    }
}
