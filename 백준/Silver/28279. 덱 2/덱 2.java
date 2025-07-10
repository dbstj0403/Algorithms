import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            if(str[0].equals("1")) {
                deque.offerFirst(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("2")) {
                deque.offerLast(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("3")) {
                if(!deque.isEmpty()) {
                    sb.append(deque.pollFirst() + "\n");
                }
                else{
                    sb.append("-1\n");
                }
            }
            else if(str[0].equals("4")) {
                if(!deque.isEmpty()) {
                    sb.append(deque.pollLast() + "\n");
                }
                else{
                    sb.append("-1\n");
                }
            }
            else if(str[0].equals("5")) {
                sb.append(deque.size() + "\n");
            }
            else if(str[0].equals("6")) {
                if(!deque.isEmpty()) {
                    sb.append("0\n");
                }
                else{
                    sb.append("1\n");
                }
            }
            else if(str[0].equals("7")) {
                if(!deque.isEmpty()) {
                    sb.append(deque.peekFirst() + "\n");
                }
                else{
                    sb.append("-1\n");
                }
            }
            else{
                if(!deque.isEmpty()) {
                    sb.append(deque.peekLast() + "\n");
                }
                else{
                    sb.append("-1\n");
                }
            }
        }
        System.out.println(sb);
    }
}
