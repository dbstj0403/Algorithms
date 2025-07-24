import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정수 B에 0보다 큰 정수인 N을 곱해 정수 A를 만들 수 있다면 A는 B의 배수

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        System.out.println(LCM(A, B));

    }

    static long LCM(long a, long b) {
        long max = Math.max(a, b);

        for(int i = 1; ; i++){
            long temp = max * i;
            if(temp % Math.min(a, b) == 0){
                max = temp;
                break;
            }
        }

        return max;
    }
}
