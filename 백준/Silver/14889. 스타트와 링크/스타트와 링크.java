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

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backtrack(0, 0);
        System.out.println(minVal);
    }

    static void backtrack(int start, int depth){
        if(depth == N / 2){
            // 두 팀의 점수차 계산
            List<Integer> startTeam = new ArrayList<>();
            List<Integer> linkTeam = new ArrayList<>();

            // 팀 분리
            for(int i = 0; i < picked.length; i++){
                startTeam.add(picked[i]);
            }
            for(int i = 0; i < N; i++){
                if(!startTeam.contains(i)){
                    linkTeam.add(i);
                }
            }

            minVal = Math.min(minVal, calculate(startTeam, linkTeam));
            return;
        }

        for(int i = start; i < N; i++){
            picked[depth] = i;
            backtrack(i + 1, depth+ 1);
        }
    }

    static int calculate(List<Integer> startTeam, List<Integer> linkTeam){
        int startTeamScore = 0;
        int linkTeamScore = 0;

        for(int i = 0; i < startTeam.size(); i++){
            for(int j = i + 1; j < startTeam.size(); j++){
                int a = startTeam.get(i);
                int b = startTeam.get(j);
                startTeamScore += arr[a][b] + arr[b][a];
            }
        }

        for(int i = 0; i < linkTeam.size(); i++){
            for(int j = i + 1; j < linkTeam.size(); j++){
                int a = linkTeam.get(i);
                int b = linkTeam.get(j);
                linkTeamScore += arr[a][b] + arr[b][a];
            }
        }

        return Math.abs(startTeamScore - linkTeamScore);
    }
}
