import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 도현이의 집 N개가 수직선 위에 있음.
        // 한 집에는 공유기를 한 개만 설치할 수 있고, 가장 인접한 두 공유기 사이의 거리를 최대한 크게 하여 설치
        // C개의 공유기를 N개의 집에 설치해 두 공유기 사이 거리를 최대로 하는 프로그램 작성

        long N = Long.parseLong(st.nextToken()); // 집의 개수
        long C = Long.parseLong(st.nextToken()); // 공유기 개수

        long[] arr = new long[(int) N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(binarySearch(arr, C));
    }

    static long binarySearch(long[] arr, long C){
        long left = 1;
        long right = arr[arr.length - 1] - arr[0];
        long answer = 0;
        while(left <= right){
            long mid = (left + right) / 2;
            if(checkMid(arr, mid, C)){
                answer = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return answer;
    }

    static boolean checkMid(long[] arr, long mid, long C){
        long count = 1;
        long last = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] - last >= mid){
                count++;
                last = arr[i];
            }
        }
        return count >= C;
    }
}
