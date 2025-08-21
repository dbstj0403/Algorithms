import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            lines.add(new Line(a, b));
        }

        Collections.sort(lines, (o1, o2) -> o1.a - o2.a);
        int[] B = new int[N];
        int idx = 0;

        for(Line line : lines) {
            B[idx++] = line.b;
        }

        int[] LIS = new int[N];
        Arrays.fill(LIS, 1);
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if(B[i] > B[j]) LIS[i] = Math.max(LIS[i], LIS[j] + 1);
            }
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            ans = Math.max(ans, LIS[i]);
        }

        System.out.println(N - ans);
    }
}

class Line {
    int a, b;
    Line(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
