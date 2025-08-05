import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            if(num != 0){
                minHeap.offer(num);
            }
            else{
                if(minHeap.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(minHeap.poll());
                }
            }
        }
    }
}
