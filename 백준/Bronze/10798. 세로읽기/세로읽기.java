import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] answer = new String[15][15];

        for(int i = 0; i < 5; i++) {
            String[] str = br.readLine().split("");
            int len = str.length;
            for(int j = 0; j < 15; j++) {
                if(j >= len){
                    answer[i][j] = " ";
                }
                else{
                    answer[i][j] = str[j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        // 0, 0 -> 1, 0 -> 2, 0 -> 3, 0 -> 4, 0 -> 5, 0
        // 0, 1 -> 1, 1 -> 2, 1 -> 3, 1 -> 4, 1 -> 5, 1
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                sb.append(answer[j][i]);
            }
        }

        String printStr = sb.toString().replaceAll(" ", "");
        System.out.println(printStr);

    }
}
