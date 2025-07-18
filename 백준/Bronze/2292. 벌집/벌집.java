import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int cur = 1;
        int found = 1;

        while(true){
            if(N == 1){
                System.out.println(found);
                break;
            }
            cur += found * 6;
            found++;

            if(N <= cur){
                System.out.println(found);
                break;
            }
        }
    }
}
