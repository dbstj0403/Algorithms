import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        Integer[] B = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) B[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A);                              // A 오름차순
        Arrays.sort(B, Collections.reverseOrder());  // B 내림차순

        long S = 0;
        for (int i = 0; i < N; i++) S += 1L * A[i] * B[i];

        System.out.println(S);
    }
}
