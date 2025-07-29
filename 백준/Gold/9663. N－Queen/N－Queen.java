import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] chess;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        // 인덱스를 행, 원소 값을 열이라고 생각하기
        chess = new int[N];
        nqueen(0);
        System.out.println(count);
    }

    // depth를 행이라고 생각하기!
    static void nqueen(int depth){
        if(depth == N){
            count++;
            return;
        }

        // 놓을 수 있는 열을 탐색한다.
        for(int i = 0; i < N; i++){
            chess[depth] = i;
            if(possible(depth)){
                nqueen(depth + 1);
            }
        }
    }

    static boolean possible(int col){
        for(int i = 0; i < col; i++){
            if(chess[i] == chess[col]){
                return false; // 같은 열에 놓은 적 있는지 체크
            }
            else if(Math.abs(col - i) == Math.abs(chess[col] - chess[i])){
                return false;
            }
        }
        return true;
    }
}

