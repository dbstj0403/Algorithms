import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 주어진 숫자의 가장 작은 생성자 구하기

        int n = Integer.parseInt(st.nextToken());
        int constructor = 0;

        for(int i = 0; i <= n; i++) {
            String str = String.valueOf(i);
            int sum = i;
            for(char c : str.toCharArray()) {
                int num = c - '0';
                sum += num;
            }
            if(sum == n){
                constructor = i;
                break;
            }
        }

        System.out.println(constructor);
    }
}
