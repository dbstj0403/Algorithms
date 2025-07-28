import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dist = new int[N - 1]; // 거리
        int[] cost = new int[N];     // 기름값

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long total = 0;
        int minCost = cost[0];

        for(int i = 0; i < N - 1; i++) {
            if(cost[i] < minCost) {
                minCost = cost[i];
            }
            total += (long) minCost * dist[i];
        }

        System.out.println(total);
    }
}
