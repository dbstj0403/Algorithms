import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] maps;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static ArrayList<Integer> paints = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 그림의 개수와 넓이가 가장 넓은 것의 넓이

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maps = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(maps[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(paints.size());
        
        if (paints.isEmpty()) {
            System.out.println(0); // 그림이 없으면 0
        } else {
            System.out.println(Collections.max(paints)); // 가장 큰 그림 넓이
        }
    }

    static void bfs(int i, int j) {
        visited[i][j] = true;
        int cnt = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i, j});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int cur_row = cur[0];
            int cur_col = cur[1];

            for(int k = 0; k < 4; k++) {
                int nx = cur_row + dx[k];
                int ny = cur_col + dy[k];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    cnt++;
                    q.offer(new int[] {nx, ny});
                }
            }
        }

        paints.add(cnt);
    }
}
