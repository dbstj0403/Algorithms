import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(); 

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken(); 

            if (cmd.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if (cmd.equals("pop")) {
                if (stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.pop()).append("\n");
            }
            else if (cmd.equals("size")) {
                sb.append(stack.size()).append("\n");
            }
            else if (cmd.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            }
            else if (cmd.equals("top")) {
                if (stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.peek()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
