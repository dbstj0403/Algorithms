import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬 후 중복 제거
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank++);
            }
        }

        // 원본 배열 기준으로 압축 값 출력
        for (int i = 0; i < n; i++) {
            sb.append(map.get(origin[i])).append(" ");
        }

        System.out.println(sb);
    }
}
