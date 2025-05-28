import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            change(arr, a, b);
        }

        // 배열 요소를 공백으로 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void change(int[] arr, int a, int b) {
        a--;
        b--;

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
