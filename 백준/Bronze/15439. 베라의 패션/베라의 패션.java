import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 상의 N벌과 하의 N벌, 상의와 하의가 서로 다른 조합은 몇가지?
        
        int N = Integer.parseInt(st.nextToken());
        int result = N * (N - 1);

        System.out.println(result);
    }
}
