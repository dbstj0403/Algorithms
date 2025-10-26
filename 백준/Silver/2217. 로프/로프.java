import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] lines = new int[N];

        for(int i = 0; i < N; i++) {
            lines[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lines);

        int max = 0;
        int count = N;

        for(int i = 0; i < N; i++) {
            int cur = lines[i];
            if(cur * count > max) max = cur * count;
            count--;
        }

        System.out.println(max);
    }
}
