import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] typeStr = br.readLine().split(" ");
        String[] initialStr = br.readLine().split(" ");

        Deque<Integer> deque = new ArrayDeque<>();

        // 자료구조가 queue(0)인 것만 deque에 역순으로 삽입
        for (int i = 0; i < n; i++) {
            if (typeStr[i].equals("0")) {
                deque.addLast(Integer.parseInt(initialStr[i]));
            }
        }

        int m = Integer.parseInt(br.readLine());
        String[] insertStr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            deque.addFirst(Integer.parseInt(insertStr[i])); // insert 순서대로 앞에 삽입
            sb.append(deque.pollLast()).append(" ");        // 뒤에서 꺼내 출력
        }

        System.out.println(sb);
    }
}
