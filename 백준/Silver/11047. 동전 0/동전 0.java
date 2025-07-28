import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 준규가 가지고 있는 동전은 총 N종류, 그 가치의 합을 K로 만드려고 함. 이때 필요한 동전 개수의 최솟값 구하기

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        Collections.sort(list, Comparator.reverseOrder());

        for(int i = 0; i < N; i++) {
            if(list.get(i) <= K){
                count += K / list.get(i);
                K = K % list.get(i);
            }

            if(K == 0){
                break;
            }
        }

        System.out.println(count);
    }
}
