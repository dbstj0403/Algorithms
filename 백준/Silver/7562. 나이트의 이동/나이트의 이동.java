import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] visited;
    static int[][] dist;
    static int l;
    static int[] d_col = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] d_row = {-2, -1, 1, 2, 2, 1, -1, -2};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T --> 0) {
            l = Integer.parseInt(br.readLine());
            visited = new boolean[l][l];
            dist = new int[l][l];

            st = new StringTokenizer(br.readLine());
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int des_col = Integer.parseInt(st.nextToken());
            int des_row = Integer.parseInt(st.nextToken());

            bfs(col, row, des_col, des_row);

            System.out.println(dist[des_col][des_row]);
        }
    }

    static void bfs(int start_col, int start_row, int des_col, int des_row) {
        visited[start_col][start_row] = true;
        dist[start_col][start_row] = 0;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start_col, start_row});

        while(!q.isEmpty()) {
            int[] cur = q.poll();

            int cur_col = cur[0];
            int cur_row = cur[1];

            if(cur_col == des_col && cur_row == des_row) return;

            ArrayList<int[]> new_pos_list = new ArrayList<>();

            for(int d = 0; d < d_col.length; d++) {
                new_pos_list.add(new int[] {cur_col + d_col[d], cur_row + d_row[d]});
            }

            for(int[] pos : new_pos_list) {
                if(pos[0] >= 0 && pos[0] < l && pos[1] >= 0 && pos[1] < l && !visited[pos[0]][pos[1]]) {
                    visited[pos[0]][pos[1]] = true;
                    dist[pos[0]][pos[1]] = dist[cur_col][cur_row] + 1;
                    q.offer(new int[]{pos[0], pos[1]});
                }
            }
        }
    }
}
