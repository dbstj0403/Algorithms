import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 종말의 수란 6이 연속으로 3번 이상 들어가는 수
        int n = Integer.parseInt(st.nextToken());
        int count = 0;

        // 666 1666 2666 3666 4666 ... 6666 10666 11666 12666 ...
        for(int i = 666; ; i++) {
            // 1씩 증가시키면서 666이 포함되어 있는지 카운트
            if (String.valueOf(i).contains("666")) {
                count++;
            }
            if (count == n) {
                System.out.println(i);
                break;
            }
        }
    }
}
