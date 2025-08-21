import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물품 개수
        int K = Integer.parseInt(st.nextToken()); // 배낭 무게 제한

        int[] W = new int[N + 1]; // 무게
        int[] V = new int[N + 1]; // 가치

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {          // i번째 물건까지 고려
            for (int j = 1; j <= K; j++) {      // 현재 배낭 허용 무게 j
                if (W[i] > j) {
                    // i번째 물건을 못 넣는 경우
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // i번째 물건을 넣는 경우 vs 안 넣는 경우 중 최댓값
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
                }
            }
        }

        System.out.println(dp[N][K]); // 최대 가치 출력
    }
}
