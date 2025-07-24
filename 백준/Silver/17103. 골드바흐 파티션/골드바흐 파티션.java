import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 1000001;
    static boolean[] isNotPrime = new boolean[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        // 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 함. 이 개수를 구해보자.
        makeSieve();

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int count = 0;

            for(int j = 2; j <= N / 2; j++){
                if(!isNotPrime[j] && !isNotPrime[N - j]){
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
