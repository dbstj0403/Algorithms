import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[][] points = new boolean[101][101];
        int count = 0;

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    points[j][k] = true;
                }
            }
        }

        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                if(points[i][j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
