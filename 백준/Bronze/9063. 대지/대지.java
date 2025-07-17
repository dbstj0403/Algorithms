import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xList.add(x);
            yList.add(y);
        }

        int minx = Collections.min(xList);
        int miny = Collections.min(yList);

        int maxx = Collections.max(xList);
        int maxy = Collections.max(yList);

        System.out.println((maxx - minx) * (maxy - miny));
    }
}
