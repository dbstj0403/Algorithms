import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long count = Integer.parseInt(st.nextToken());

        System.out.println(count * count * count);
        System.out.println(3);
    }
}
