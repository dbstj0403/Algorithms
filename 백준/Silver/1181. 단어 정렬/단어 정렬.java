import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // Set으로 중복 제거
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // 리스트로 변환 후 정렬
        List<String> list = new ArrayList<>(set);
        list.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length(); // 길이 기준
                } else {
                    return o1.compareTo(o2); // 사전순
                }
            }
        });

        // 출력
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
