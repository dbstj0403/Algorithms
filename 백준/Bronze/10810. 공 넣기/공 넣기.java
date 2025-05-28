import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int count = sc.nextInt();
            insert(arr, start, end, count);
        }

        // 배열 요소를 공백으로 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insert(int[] arr, int start, int end, int count) {
        start--;
        end--;

        for(int i = start; i <= end; i++) {
            arr[i] = count;
        }

    }
}
