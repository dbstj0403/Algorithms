import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 1000001;
    static boolean[] isNotPrime = new boolean[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 창문 및 사람의 수

        int count = 0;
        for(int i = 1; i * i <= T; i++){
            count++;
        }

        System.out.println(count);
    }
}
