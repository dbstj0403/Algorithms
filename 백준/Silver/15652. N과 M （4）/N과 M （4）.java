import java.io.*;
import java.util.*;

public class Main {
    static int M;
    static int N;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N + 1];
        backtrack(1, 0);
        System.out.println(sb);
    }

    static void backtrack(int start, int depth){
        if(depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i <= N; i++){
            if(depth == 0) arr[depth] = i;
            else if(arr[depth - 1] <= i){
                arr[depth] = i;
            }
            else{
                continue;
            }
            backtrack(start, depth + 1);
        }
    }
}
