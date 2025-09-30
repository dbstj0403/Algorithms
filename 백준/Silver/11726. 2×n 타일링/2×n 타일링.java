import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2 * n 크기의 직사각형을 1 * 2, 2 * 1 타일로 채우는 방법의 수

        int n = Integer.parseInt(br.readLine());

        // n개만큼 타일이 들어갈 수 있음
        int dp[] = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        if(n >=2 ) dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}
