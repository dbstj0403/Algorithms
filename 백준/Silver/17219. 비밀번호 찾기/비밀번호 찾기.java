import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       HashMap<String, String> map = new HashMap<>();

       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       for(int i = 0; i < N; i++) {
           st = new StringTokenizer(br.readLine());
           String site = st.nextToken();
           String password = st.nextToken();
           map.put(site, password);
       }

       for(int i = 0; i < M; i++) {
           st = new StringTokenizer(br.readLine());
           String site = st.nextToken();
           System.out.println(map.get(site));
       }
    }
}
