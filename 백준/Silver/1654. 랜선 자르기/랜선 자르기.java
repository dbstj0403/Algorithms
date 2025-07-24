import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

        long[] arr = new long[K];
        long max = 0;

        // 랜선 길이 입력 받기 + 최대 길이 찾기
        for (int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(binarySearch(arr, N, max));
    }

    // 파라메트릭 서치 함수
    static long binarySearch(long[] arr, int N, long maxLen) {
        long left = 1;
        long right = maxLen;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (check(mid, arr, N)) {
                answer = mid;
                left = mid + 1; // 더 긴 길이 시도
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    // mid 길이로 몇 개 만들 수 있는지 확인
    static boolean check(long len, long[] arr, int N) {
        long count = 0;
        for (long value : arr) {
            count += value / len;
        }
        return count >= N;
    }
}
