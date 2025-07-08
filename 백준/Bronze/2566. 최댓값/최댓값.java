import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 9 * 9 격자판 숫자 존재
        int max = 0;
        int w = 1;
        int h = 1;

        for(int i = 0; i < 9; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j < 9; j++){
                int n = Integer.parseInt(str[j]);
                if(n > max){
                    max = n;
                    w = i + 1;
                    h = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(w);
        System.out.print(" " + h);
    }
}
