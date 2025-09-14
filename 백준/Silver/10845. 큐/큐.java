import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;

       Deque<Integer> dq = new LinkedList<>();

       int N = Integer.parseInt(br.readLine());

       for(int i = 0; i < N; i++) {
           st = new StringTokenizer(br.readLine());
           String command = st.nextToken();
           if(command.equals("push")) dq.offer(Integer.parseInt(st.nextToken()));
           else if(command.equals("pop")) {
               if(dq.isEmpty()) System.out.println(-1);
               else {
                   int num = dq.poll();
                   System.out.println(num);
               }
           }
           else if(command.equals("size")) System.out.println(dq.size());
           else if(command.equals("empty")) {
               if(dq.isEmpty()) System.out.println(1);
               else System.out.println(0);
           }
           else if(command.equals("front")) {
               if(dq.isEmpty()) System.out.println(-1);
               else System.out.println(dq.peekFirst());
           }
           else if(command.equals("back")) {
               if(dq.isEmpty()) System.out.println(-1);
               else System.out.println(dq.peekLast());
           }
       }
    }
}
