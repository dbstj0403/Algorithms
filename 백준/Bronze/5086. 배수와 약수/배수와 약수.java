import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(n1 == 0 && n2 == 0){
                break;
            }

            if(n2 % n1 == 0){
                System.out.println("factor");
            }
            else if(n1 % n2 == 0){
                System.out.println("multiple");
            }
            else{
                System.out.println("neither");
            }
        }
    }
}
