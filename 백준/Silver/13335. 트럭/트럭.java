import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 트럭의 수
        int w = Integer.parseInt(st.nextToken()); // 다리 길이
        int L = Integer.parseInt(st.nextToken()); // 최대 하중

        Queue<Integer> trucks = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            trucks.add(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> bridge = new LinkedList<>();
        for(int i = 0; i < w; i++) {
            bridge.add(0);
        }

        int time = 0;
        int totalWeight = 0;

        while(!bridge.isEmpty()) {
            time++;
            totalWeight -= bridge.poll();

            if (!trucks.isEmpty()) {
                if (totalWeight + trucks.peek() <= L) {
                    int next = trucks.poll();
                    bridge.add(next);
                    totalWeight += next;
                } else {
                    bridge.add(0);
                }
            }
        }

        System.out.println(time);
    }
}
