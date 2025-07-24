import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];
        long[] diff = new long[N - 1];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }

        long minDiff = gcdOfArray(diff);
        long count = 0;

        for(int i = 0; i < N - 1; i++) {
            if(arr[i + 1] - arr[i] == minDiff){
                continue;
            }
            else{
                long temp = arr[i + 1] - arr[i];
                count += temp / minDiff - 1;
            }
        }

        System.out.println(count);
    }

    static long gcdOfArray(long[] nums){
        long result = nums[0];
        for(int i = 1; i < nums.length; i++) {
            result = gcd(result, nums[i]);
        }
        return result;
    }

    static long gcd(long a, long b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }
}
