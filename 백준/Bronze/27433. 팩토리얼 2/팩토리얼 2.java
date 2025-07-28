import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        System.out.println(factorial(N));

    }

    static long factorial(int n) {
        if(n == 1 || n == 0) return 1;
        return n * factorial(n-1);
    }
}
