import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int n0 = Integer.parseInt(st.nextToken());

        if (a1 > c) {
            System.out.println(0); // 기울기가 더 큼 → 언젠가 무조건 초과
        } else if ((a1 - c) * n0 + a0 > 0) {
            System.out.println(0); // y절편이 커서 n0에서도 초과함
        } else {
            System.out.println(1); // 두 조건 모두 만족 → OK
        }

    }
}
