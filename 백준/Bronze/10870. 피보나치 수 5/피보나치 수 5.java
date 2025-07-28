import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n번째 피보나치 수 구하기
        int n = Integer.parseInt(st.nextToken());
        System.out.println(fibo(n));
    }

    static int fibo(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}
