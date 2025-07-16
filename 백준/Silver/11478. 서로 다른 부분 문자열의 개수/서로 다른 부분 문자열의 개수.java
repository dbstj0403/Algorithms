import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> parts = new HashSet<>();
        // 서로 다른 부분 문자열 개수 출력하기
        String str = st.nextToken();

        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String part = str.substring(i, j);
                parts.add(part);
            }
        }

        System.out.println(parts.size());
    }
}
