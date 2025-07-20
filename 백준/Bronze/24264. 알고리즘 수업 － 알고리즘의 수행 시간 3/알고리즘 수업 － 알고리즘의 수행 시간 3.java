import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long count = Integer.parseInt(st.nextToken());

        // 수식 시간 복잡도 O(N^2)
        System.out.println(count * count);
        System.out.println(2);
    }
}
