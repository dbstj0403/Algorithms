import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 카드 개수
        int m = Integer.parseInt(st.nextToken()); // 카드 합체 횟수

        long[] cards = new long[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 작은 수와 작은 수를 골라 합쳐야 한다.
        Arrays.sort(cards);
        while(m --> 0) {
            long x = cards[0];
            long y = cards[1];
            long sum = x + y;

            cards[0] = sum;
            cards[1] = sum;

            Arrays.sort(cards);
        }

        long result = 0;

        for(int i = 0; i < n; i++) {
            result += cards[i];
        }

        System.out.println(result);

    }
}
