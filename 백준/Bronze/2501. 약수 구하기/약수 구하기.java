import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        // N의 약수 중 K번째로 작은 것
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                count++;
            }
            if(count == K){
                System.out.println(i);
                break;
            }
            if(i == N && count < K){
                System.out.println(0);
            }
        }

    }
}
