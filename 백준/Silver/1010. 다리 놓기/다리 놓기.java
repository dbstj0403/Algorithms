import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(combination(M, N));
        }
    }

    static long combination(int n, int r){
        long result = 1;
        if(r > n - r) r = n -r;
        for(int i = 1; i <= r; i++){
            result *= (n - i + 1);
            result /= i;
        }
        return result;
    }
}
