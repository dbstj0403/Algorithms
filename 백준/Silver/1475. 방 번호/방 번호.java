import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[9];
        Arrays.fill(arr, 0);

        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(num == 6 || num == 9) arr[6]++;
            else arr[num]++;
        }

        if(arr[6] % 2 == 0) arr[6] = arr[6] / 2;
        else arr[6] = arr[6] / 2 + 1;

        int max = arr[0];
        for(int i : arr) {
            if(i > max) max = i;
        }

        System.out.println(max);
    }
}
