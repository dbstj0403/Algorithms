import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] LIS = new int[N];
        int[] LDS = new int[N];

        Arrays.fill(LIS, 1);
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) LIS[i] = Math.max(LIS[i], LIS[j] + 1);
            }
        }

        Arrays.fill(LDS, 1);
        for(int i = N - 1; i >= 0; i--) {
            for(int j = N - 1; j > i; j--) {
                if(arr[i] > arr[j]) LDS[i] = Math.max(LDS[i], LDS[j] + 1);
            }
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            ans = Math.max(ans, LIS[i] + LDS[i] - 1);
        }

        System.out.println(ans);
    }
}
