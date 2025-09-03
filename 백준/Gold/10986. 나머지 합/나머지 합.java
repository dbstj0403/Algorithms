import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] cnt = new long[M]; // 각 나머지 개수
        long[] prefix = new long[N + 1];
        prefix[0] = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + Integer.parseInt(st.nextToken());
            int mod = (int)(prefix[i] % M);
            cnt[mod]++;
        }

        long answer = cnt[0]; // 처음부터 나눠떨어지는 경우
        for (int i = 0; i < M; i++) {
            if (cnt[i] > 1) {
                answer += cnt[i] * (cnt[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }
}
