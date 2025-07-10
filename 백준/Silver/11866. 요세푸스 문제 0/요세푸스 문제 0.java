import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while(!q.isEmpty()) {
            for(int i = 0; i < K - 1; i++){
                int num = q.poll();
                q.offer(num);
            }

            int n = q.poll();

            if(q.isEmpty()){
                sb.append(n).append(">");
            }
            else{
                sb.append(n).append(", ");
            }
        }
        System.out.println(sb);
    }
}
