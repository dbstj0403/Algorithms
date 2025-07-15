import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder print = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        sb.append(st.nextToken());

        for(char c : sb.toString().toCharArray()) {
            int n = Integer.parseInt(Character.toString(c));
            list.add(n);
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i < list.size(); i++) {
            print.append(list.get(i));
        }

        System.out.println(print);
    }
}
