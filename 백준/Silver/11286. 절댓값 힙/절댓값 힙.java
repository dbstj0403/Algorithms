import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> {
                    int absa = Math.abs(a);
                    int absb = Math.abs(b);
                    if(absa != absb) return absa - absb;
                    return a - b;
                });

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(pq.isEmpty()) System.out.println(0);
                else{
                    System.out.println(pq.poll());
                }
            }
            else{
                pq.add(num);
            }
        }
    }
}
