import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<int[]> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0; i < N; i++) {
            deque.offerLast(new int[] {i + 1, arr[i]});
        }

        while(!deque.isEmpty()) {
            int[] cur = deque.pollFirst();
            sb.append(cur[0] + " ");
            if(deque.isEmpty()) {
                break;
            }

            if(cur[1] > 0){
                int point = Math.abs(cur[1]);
                for(int j = 0; j < point - 1; j++){
                    int[] n = deque.pollFirst();
                    deque.offerLast(n);
                }
            }
            else{
                int point = Math.abs(cur[1]);
                for(int j = 0; j < point; j++){
                    int[] n = deque.pollLast();
                    deque.offerFirst(n);
                }
            }
        }
        System.out.println(sb);
    }
}
