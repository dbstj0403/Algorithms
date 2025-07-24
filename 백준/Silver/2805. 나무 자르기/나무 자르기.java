import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken()); // 나무의 수
        long M = Long.parseLong(st.nextToken()); // 집에 가져가려는 나무의 길이

        long[] arr = new long[(int) N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(binarySearch(arr, M));
    }

    static long binarySearch(long[] arr, long M){
        long left = 1;
        long right = arr[arr.length - 1];
        long h = 0;

        while(left <= right){
            long mid = (right + left) / 2;
            if(checkMid(arr, mid, M)){
                left = mid + 1;
                h = mid;
            }
            else{
                right = mid - 1;
            }
        }
        return h;
    }

    static boolean checkMid(long[] arr, long mid, long M){
        long count = 0;
        for(long tree : arr){
            if(tree > mid){
                count += tree - mid;
            }
        }
        return count >= M;
    }
}
