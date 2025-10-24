import java.io.*;
import java.util.*;

public class Main {
    static int M;
    static int N;
    static int[][] maps;
    static boolean[][] visited;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        maps = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int n = Integer.parseInt(st.nextToken());
                maps[i][j] = n;
            }
        }

        System.out.println(simulate(r, c, d));

    }

    static int simulate(int r, int c, int d) {
        int cleaned = 0;

        if(!visited[r][c] && maps[r][c] == 0) {
            visited[r][c] = true;
            cleaned++;
        }

        while(true) {
            boolean moved = false;
            for(int k = 0; k < 4; k++) {
                d = (d + 3) % 4;
                int nr = r + dr[d];
                int nc = c + dc[d];
                if(!in(nr, nc)) continue;
                if(maps[nr][nc] == 0 && !visited[nr][nc]) {
                    r = nr; c = nc;
                    visited[r][c] = true;
                    cleaned++;
                    moved = true;
                    break;
                }
            }

            if(moved) continue;

            int backDir = (d + 2) % 4;
            int br = r + dr[backDir];
            int bc = c + dc[backDir];

            if(!in(br, bc) || maps[br][bc] == 1) {
                break;
            }

            r = br; c = bc;
        }

        return cleaned;
    }

    static boolean in(int r, int c) {
        if(r >= 0 && r < N && c >= 0 && c < M) return true;
        else return false;
    }
}
