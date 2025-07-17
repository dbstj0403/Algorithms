import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        // n + 1 + n * 2 + (n - 1) = 4n
        // 입력은 최대 10의 9승
        System.out.println(4 * n);
    }
}
