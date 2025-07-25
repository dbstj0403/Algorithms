import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int result = 1;
        if(N != 0){
            while(!(N == 1)){
                result *= N;
                N--;
            }   
        }

        System.out.println(result);
    }
}
