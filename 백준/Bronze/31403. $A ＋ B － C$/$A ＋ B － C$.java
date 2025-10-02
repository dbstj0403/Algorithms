import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        // 숫자로 생각
        System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));

        // 문자로 생각
        int ab = Integer.parseInt(A + B);
        int c = Integer.parseInt(C);

        System.out.println(ab - c);
    }
}
