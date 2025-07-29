import java.io.*;
import java.util.*;

public class Main {
    static int[][] sdoku = new int[9][9];
    static List<int[]> emptyList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                sdoku[i][j] = Integer.parseInt(st.nextToken());
                if(sdoku[i][j] == 0) emptyList.add(new int[]{i, j});
            }
        }

        solve(0);
    }

    static void solve(int depth){
        if(depth == emptyList.size()){
            print();       // 정답 출력
            System.exit(0); // 종료
        }

        int x = emptyList.get(depth)[0];
        int y = emptyList.get(depth)[1];

        for(int i = 1; i <= 9; i++){
            if(isValid(x, y, i)){
                sdoku[x][y] = i;
                solve(depth + 1);
                sdoku[x][y] = 0; // 백트래킹
            }
        }
    }

    static void print() {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(sdoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isValid(int x, int y, int value){
        // 가로
        for(int i = 0; i < 9; i++){
            if(sdoku[x][i] == value) return false;
        }

        // 세로
        for(int i = 0; i < 9; i++){
            if(sdoku[i][y] == value) return false;
        }

        // 3x3 박스
        int boxX = (x / 3) * 3;
        int boxY = (y / 3) * 3;

        for(int i = boxX; i < boxX + 3; i++){
            for(int j = boxY; j < boxY + 3; j++){
                if(sdoku[i][j] == value) return false;
            }
        }

        return true;
    }
}
