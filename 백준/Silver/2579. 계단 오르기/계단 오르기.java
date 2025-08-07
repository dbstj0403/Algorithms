import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] stairs = new int[N + 1];

        for(int i = 1; i < N + 1; i++) {
            int score = Integer.parseInt(br.readLine());
            stairs[i] = score;
        }

        int[] dp = new int[N + 1];
        for(int i = 1; i < N + 1; i++) {
            if(i == 1) dp[i] = stairs[1];
            else if(i == 2) dp[i] = stairs[1] + stairs[2];
            else if(i == 3) dp[i] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);
            else dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
        }

        System.out.println(dp[N]);
    }
}
