import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 양수 A가 N의 진짜 약수가 되려면 N이 A의 배수이고 A가 1과 N이 아니어야 함.

        int count = Integer.parseInt(st.nextToken());
        int[] arr = new int[count];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if(count % 2 == 1){
            // 제곱수이므로 진짜 약수의 가운데 수 제곱하기
            int len = arr.length;
            int x = arr[len / 2];
            System.out.println(x * x);
        }
        else{
            int result = arr[0] * arr[arr.length - 1];
            System.out.println(result);
        }
    }

}
