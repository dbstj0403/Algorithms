import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        Set<String> set = new HashSet<>(); 

        while (N -- > 0) {
            String token = br.readLine();

            if (token.equals("ENTER")) {
                count += set.size(); 
                set.clear();         
            } else {
                set.add(token);
            }
        }
        count += set.size();

        System.out.println(count);
    }
}
