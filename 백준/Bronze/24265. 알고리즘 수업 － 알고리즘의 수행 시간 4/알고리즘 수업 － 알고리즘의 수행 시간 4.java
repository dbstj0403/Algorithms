import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long count = Integer.parseInt(st.nextToken());

        // 수식 시간 복잡도 O(N^2)
        // 1(N - 1) 2(N-2) 3(N-3) 4(N-4) 5(N-5) 6(N-6)
        // 6N - 21 (1 + 2 + 3 + 4 + 5 + 6)
        // (N-1) * N - (N-1)N / 2

        long result = (count - 1) * count - (count - 1) * count / 2;
        System.out.println(result);
        System.out.println(2);
    }
}
