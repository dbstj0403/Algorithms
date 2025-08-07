import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] triangle = new int[N][N];
        int[][] dp = new int[N][N];

        // 2차원 배열에 주어진 정수 삼각형 숫자 담기
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 첫번쨰 요소
        dp[0][0] = triangle[0][0];

        for(int i = 1; i < N; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0) dp[i][j] = dp[i - 1][j] + triangle[i][j];
                else if(j == i) dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                else dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
            }
        }

        int result = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            if(result < dp[N - 1][i]) result = dp[N - 1][i];
        }

        System.out.println(result);
    }
}
