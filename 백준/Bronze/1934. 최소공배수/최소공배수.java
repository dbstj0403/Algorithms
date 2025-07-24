import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // A와 B의 최소공배수 구하기

        int N = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = LCM(A, B);
            System.out.println(result);
        }
    }

    static int LCM(int a, int b) {
        int max = Math.max(a, b);
        for(int i = 1; i <= Math.min(a, b); i++){
            int temp = max * i;

            if(temp % Math.min(a, b) == 0){
                max = temp;
                break;
            }
        }

        return max;
    }
}
