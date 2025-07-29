import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int minVal = Integer.MAX_VALUE;
    static int[][] arr;
    static int[] picked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        picked = new int[N / 2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtrack(0, 0);
        System.out.println(minVal);
    }

    static void backtrack(int start, int depth) {
        if (depth == N / 2) {
            calculate();
            return;
        }

        for (int i = start; i < N; i++) {
            picked[depth] = i;
            backtrack(i + 1, depth + 1);
        }
    }

    static void calculate() {
        boolean[] isPicked = new boolean[N];
        for (int i : picked) {
            isPicked[i] = true;
        }

        int startSum = 0;
        int linkSum = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isPicked[i] && isPicked[j]) {
                    startSum += arr[i][j] + arr[j][i];
                } else if (!isPicked[i] && !isPicked[j]) {
                    linkSum += arr[i][j] + arr[j][i];
                }
            }
        }

        minVal = Math.min(minVal, Math.abs(startSum - linkSum));
    }
}
