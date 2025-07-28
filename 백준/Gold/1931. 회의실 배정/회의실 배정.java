import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new int[]{start, end});
        }

        // 종료 시간 기준 정렬 (끝나는 시간이 같으면 시작 시간 오름차순)
        list.sort((o1, o2) -> {
            if (o1[1] != o2[1]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        int count = 0;
        int endTime = 0;

        for (int[] meeting : list) {
            if (meeting[0] >= endTime) {
                endTime = meeting[1];
                count++;
            }
        }

        System.out.println(count);
    }
}
