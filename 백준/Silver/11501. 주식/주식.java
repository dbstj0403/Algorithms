import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] a = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());

            long profit = 0;          // 이익 합은 long!
            int maxPrice = 0;         // 뒤에서부터 본 최대가

            for (int i = N - 1; i >= 0; i--) {
                if (a[i] <= maxPrice) {
                    profit += (maxPrice - a[i]);
                } else {
                    maxPrice = a[i];
                }
            }
            System.out.println(profit);
        }
    }
}
