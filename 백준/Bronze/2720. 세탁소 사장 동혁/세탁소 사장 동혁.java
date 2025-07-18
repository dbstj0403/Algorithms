import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int cents = Integer.parseInt(br.readLine()); // 센트 단위 입력

            int q = cents / 25;
            cents %= 25;

            int d = cents / 10;
            cents %= 10;

            int n = cents / 5;
            cents %= 5;

            int p = cents;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
