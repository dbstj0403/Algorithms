import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        while(N --> 0){
            st = new StringTokenizer(br.readLine());
            String p1 = st.nextToken();
            String p2 = st.nextToken();
            if(p1.equals("ChongChong") || p2.equals("ChongChong")){
                set.add(p1);
                set.add(p2);
            }
            else if(set.contains(p1)){
                set.add(p2);
            }
            else if(set.contains(p2)){
                set.add(p1);
            }
        }

        System.out.println(set.size());
    }
}
