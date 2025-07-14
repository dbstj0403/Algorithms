import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        char[][] board = new char[M][N];

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int x = 0; x <= M - 8; x++) {
            for (int y = 0; y <= N - 8; y++) {
                int count1 = 0; // 시작이 'W'
                int count2 = 0; // 시작이 'B'

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = board[x + i][y + j];

                        // i+j 짝수: 시작문자와 같아야, 홀수: 반대여야
                        if ((i + j) % 2 == 0) {
                            if (current != 'W') count1++;
                            if (current != 'B') count2++;
                        } else {
                            if (current != 'B') count1++;
                            if (current != 'W') count2++;
                        }
                    }
                }

                min = Math.min(min, Math.min(count1, count2));
            }
        }

        System.out.println(min);
    }
}
