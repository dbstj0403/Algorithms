import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String type = st.nextToken();

            if(type.equals("enter")){
                set.add(name);
            }
            else{
                set.remove(name);
            }
        }

        // 사전순의 역순으로 소팅
        List<String> list = new ArrayList<>(set);
        list.sort((a, b) -> b.compareTo(a));

        for(String p : list){
            System.out.println(p);
        }
    }
}
