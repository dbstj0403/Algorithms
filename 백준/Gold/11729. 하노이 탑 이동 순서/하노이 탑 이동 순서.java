import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        sb.append((1 << N) - 1).append("\n");  // 2^N - 1 출력
        hanoi(N, 1, 3, 2);
        System.out.print(sb);
    }

    // 하노이 함수
    public static void hanoi(int n, int start, int end, int temp) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        hanoi(n - 1, start, temp, end); // 1단계: n-1개를 보조 기둥으로
        sb.append(start).append(" ").append(end).append("\n"); // 2단계: 가장 큰 원판을 목표 기둥으로
        hanoi(n - 1, temp, end, start); // 3단계: 보조 기둥에 있는 n-1개를 목표 기둥으로
    }
}
