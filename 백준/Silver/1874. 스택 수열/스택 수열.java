import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int num = 1; // 현재 넣어야 할 숫자
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            // target까지 push
            while (num <= target) {
                stack.push(num++);
                sb.append("+\n");
            }

            // 스택 맨 위가 target이면 pop
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                // 원하는 수열 불가능
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}
