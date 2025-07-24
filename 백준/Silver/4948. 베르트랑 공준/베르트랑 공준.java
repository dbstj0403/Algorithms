import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 1000001;
    static boolean[] isNotPrime = new boolean[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        makeSieve();

        while(true){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if(N == 0) break;
            int count = 0;
            for(int i = N + 1; i <= 2 * N; i++){
                if(!isNotPrime[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static void makeSieve(){
        isNotPrime[0] = isNotPrime[1] = true; // 0, 1은 소수가 아니므로 true
        for(int i = 2; i < MAX; i++){
            if(!isNotPrime[i]){
                for(long j = (long) i * i; j < MAX; j += i){
                    isNotPrime[(int) j] = true;
                }
            }
        }
    }
}
