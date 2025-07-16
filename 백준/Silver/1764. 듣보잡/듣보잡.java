import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> idontknow = new HashSet<>();
        Set<String> result = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            idontknow.add(name);
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(idontknow.contains(name)) {
                result.add(name);
            }
        }

        List<String> list = new ArrayList<>(result);
        list.sort((a, b) -> a.compareTo(b));

        System.out.println(list.size());

        for(String p : list){
            sb.append(p).append("\n");
        }

        System.out.println(sb);
    }
}
