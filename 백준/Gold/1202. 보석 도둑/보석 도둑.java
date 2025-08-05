import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<int[]> jewals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jewals.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        // 보석 정렬: 무게 오름차 + 가격 내림차
        jewals.sort((int[] a, int[] b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            else return a[0] - b[0];
        });

        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine()); 
        }

        Arrays.sort(bags);

        long total = 0;
        int idx = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < K; i++) {
            int capacity = bags[i];
            while (idx < N && jewals.get(idx)[0] <= capacity) {
                maxHeap.add(jewals.get(idx)[1]);
                idx++; 
            }
            if (!maxHeap.isEmpty()) {
                total += maxHeap.poll(); // 가장 비싼 보석 선택
            }
        }

        System.out.println(total);
    }
}
