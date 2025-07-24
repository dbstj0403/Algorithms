import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N개의 정수가 주어져 있을 때 이 안에 X라는 정수가 존재하는지 체크하기
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] targets = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            System.out.println(binarySearch(arr, targets[i]));
        }
    }

    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target) return 1;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return 0;
    }
}
