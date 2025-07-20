import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long count = Integer.parseInt(st.nextToken());
        long result = count * count * count - 3 * count * count + 2 * count;

        System.out.println(result / 6);
        System.out.println(3);
    }
}
