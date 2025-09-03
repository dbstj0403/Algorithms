import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 온도를 측정한 전체 날짜의 수
        int K = Integer.parseInt(st.nextToken()); // 합을 구하기 위한 연속적인 날짜의 수
        int[] prefix = new int[N + 1];
        prefix[0] = 0;

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = K; i <= N; i++) {
            max = Math.max(prefix[i] - prefix[idx], max);
            idx++;
        }

        System.out.println(max);

    }
}
