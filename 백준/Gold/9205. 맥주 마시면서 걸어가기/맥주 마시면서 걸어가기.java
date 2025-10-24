import java.io.*;
import java.util.*;

public class Main {
    static int[] home = new int[2];
    static int[] dest = new int[2];
    static ArrayList<int[]> stores;
    static int store_count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while(t --> 0) {
            store_count = Integer.parseInt(br.readLine());
            stores = new ArrayList<>();

            // 상근이네 집 좌표
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            home[0] = x1; home[1] = y1;

            for(int i = 0; i < store_count; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                stores.add(new int[]{x, y});
            }

            // 락 페스티벌 좌표
            st = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            dest[0] = x2; dest[1] = y2;

            bfs(home[0], home[1]);
        }
    }

    static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[store_count];
        q.add(new int[]{i, j});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            if(manhattanDistance(cur[0], cur[1], dest[0], dest[1]) <= 1000) {
                System.out.println("happy");
                return;
            }

            for(int k = 0; k < store_count; k++) {
                if(visited[k]) continue;
                int s[] = stores.get(k);
                if(manhattanDistance(cur[0], cur[1], s[0], s[1]) <= 1000) {
                    visited[k] = true;
                    q.add(new int[]{s[0], s[1]});
                }
            }
        }

        System.out.println("sad");
    }

    static int manhattanDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
