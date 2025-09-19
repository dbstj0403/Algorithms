import java.io.*;
import java.util.*;

public class Main {
    static int[][] maps;
    static boolean[][] visited;
    static int N;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        maps = new int[N][N];
        visited = new boolean[N][N];

        // 지도 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                maps[i][j] = line.charAt(j) - '0'; // 0 또는 1
            }
        }

        ArrayList<Integer> apt_list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && maps[i][j] == 1) {
                    apt_list.add(bfs(i, j));
                }
            }
        }

        Collections.sort(apt_list);

        System.out.println(apt_list.size()); 
        for (int answer : apt_list) {
            System.out.println(answer);      
        }
    }

    static int bfs(int i, int j) {
        int cnt = 1;
        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        cnt++;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }

        return cnt;
    }
}
