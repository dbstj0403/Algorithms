import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MOD = 1_000_000_000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N + 1][10];

        // 길이가 1일 때 초기화 (1~9 가능)
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j > 0) dp[i][j] += dp[i - 1][j - 1];
                if (j < 9) dp[i][j] += dp[i - 1][j + 1];
                dp[i][j] %= MOD;
            }
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result += dp[N][i];
        }

        System.out.println(result % MOD);
    }
}
