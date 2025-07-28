import java.io.*;
import java.util.*;

public class Main {
    static int count = 0; // 저장 횟수
    static int K;         // 목표 저장 횟수
    static int result = -1; // K번째 저장된 값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열 크기
        K = Integer.parseInt(st.nextToken());     // 저장 횟수

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, N - 1);

        System.out.println(result); // 저장 횟수가 K번 안 되었으면 -1
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while(i <= mid) temp[k++] = arr[i++];
        while(j <= right) temp[k++] = arr[j++];

        for(int t = 0; t < temp.length; t++){
            arr[left + t] = temp[t];
            count++;
            if(count == K) {
                result = arr[left + t];
                return;
            }
        }
    }
}
