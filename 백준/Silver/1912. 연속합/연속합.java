import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
        }

        dp[0] = arr[0];

        for(int i = 1; i < N; i++){
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
        }

        int max = Integer.MIN_VALUE;
        for(int num : dp){
            if(num > max){
                max = num;
            }
        }

        System.out.println(max);
    }
}
