import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // b와 d의 최소공배수 구하기
        int bunmo = lcm(b, d);
        a = a * (bunmo / b);
        c = c * (bunmo / d);
        int bunja = a + c;

        // 약분
        int g = gcd(bunja, bunmo);

        System.out.println((bunja / g) + " " + (bunmo / g));
    }

    static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
