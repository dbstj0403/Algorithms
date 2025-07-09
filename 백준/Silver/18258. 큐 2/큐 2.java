import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++) {
            String[] str = br.readLine().split(" ");

            if(str[0].equals("push")) {
                queue.offer(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("pop")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                }
                else{
                    int n = queue.poll();
                    sb.append(n).append("\n");
                }
            }
            else if(str[0].equals("size")) {
                sb.append(queue.size()).append("\n");
            }
            else if(str[0].equals("empty")) {
                if(queue.isEmpty()) {
                    sb.append("1\n");
                }
                else{
                    sb.append("0\n");
                }
            }
            else if(str[0].equals("front")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                }
                else{
                    sb.append(queue.peek()).append("\n");
                }
            }
            else{
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                }
                else{
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
