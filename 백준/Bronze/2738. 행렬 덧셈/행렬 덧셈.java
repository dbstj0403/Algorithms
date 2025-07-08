import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] sum = new int[N][M];

        for(int i = 0; i < N; i++) {
            String[] str2 = br.readLine().split(" ");

            for (int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(str2[j]);
            }
        }

        for(int i = 0; i < N; i++) {
            String[] str2 = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(str2[j]);
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(sum[i][j] + " ");
                if(j == M - 1) {
                    System.out.println();
                }
            }
        }
    }
}
