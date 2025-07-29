import java.io.*;
import java.util.*;

public class Main {
    static int M;
    static int N;
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N + 1];
        backtrack(1, 0);
    }

    static void backtrack(int start, int depth){
        if(depth == M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i <= N; i++){
            arr[depth] = i;
            backtrack(i + 1, depth + 1);
        }
    }
}
