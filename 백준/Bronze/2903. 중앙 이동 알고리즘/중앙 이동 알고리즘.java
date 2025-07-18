import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int cur = 3;
        for(int i = 1; i < N; i++) {
            cur = cur + cur - 1;
        }

        System.out.println(cur * cur);
    }
}
