import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for(int i = 0; i < N; i++) {
            int n = arr[i];
            int count = 0;

            if(n == 1){
                continue;
            }
            
            for(int j = 1; j <= Math.sqrt(n); j++) {
                if(n % j == 0) {
                    count++;
                }
            }
            
            if(count == 1){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
