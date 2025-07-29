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
        backtrack(0);
    }

    static void backtrack(int depth){
        if(depth == M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");  // 수열 출력
            }
            System.out.println();  // 줄 바꿈
            return;  // 현재 재귀 종료
        }

        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}
